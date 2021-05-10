package com.tencentcloudapi.wemeet.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.*;
import com.tencentcloudapi.wemeet.common.constants.ReqHeaderConstants;
import com.tencentcloudapi.wemeet.common.exception.WemeetSdkException;
import com.tencentcloudapi.wemeet.common.http.HttpConnection;
import com.tencentcloudapi.wemeet.common.interceptor.TerminalLog;
import com.tencentcloudapi.wemeet.common.profile.HttpProfile;
import com.tencentcloudapi.wemeet.models.AbstractModel;
import com.tencentcloudapi.wemeet.models.BaseResponse;
import com.tencentcloudapi.wemeet.util.SignUtil;

import java.io.IOException;
import java.security.SecureRandom;

/**
 * <p>http request sender</p>
 *
 * @author tencent
 * @date 2021/4/13
 */
public class RequestSender {
    private static final int HTTP_RSP_OK = 200;
    private final HttpConnection httpConnection;
    private final Gson gson;
    private final HttpProfile profile;
    private final Sign sign;

    public RequestSender(HttpProfile profile) {
        this.gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        this.profile = profile;
        this.httpConnection = new HttpConnection(
                profile.getConnTimeout(),
                profile.getReadTimeout(),
                profile.getWriteTimeout());
        addInterceptors(new TerminalLog(getClass().getName(), profile.isDebug()));
        this.sign = new DefaultSign(gson);
    }

    public interface Sign {
        /**
         * 添加签名header
         *
         * @param data    请求数据
         * @param profile http配置信息
         * @throws WemeetSdkException 签名异常
         */
        void addSignHeader(AbstractModel data, HttpProfile profile) throws WemeetSdkException;
    }

    public static class DefaultSign implements Sign {
        private final Gson gson;

        public DefaultSign(Gson gson) {
            this.gson = gson;
        }

        @Override
        public void addSignHeader(AbstractModel data, HttpProfile profile) throws WemeetSdkException {
            String nonce = String.valueOf(Math.abs(new SecureRandom().nextInt()));
            String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
            data.addHeader(ReqHeaderConstants.NONCE, nonce);
            data.addHeader(ReqHeaderConstants.TIMESTAMP, timestamp);
            if (!data.getHeaders().containsKey(ReqHeaderConstants.REGISTERED)) {
                data.addHeader(ReqHeaderConstants.REGISTERED, "1");
            }
            if (data.getHeaders() != null && data.getHeaders().containsKey(ReqHeaderConstants.ACCESS_TOKEN)
                    && data.getHeaders().containsKey(ReqHeaderConstants.OPEN_ID)) {
                // OAuth2.0鉴权
                return;
            }

            data.addHeader(ReqHeaderConstants.KEY, profile.getSecretId());
            data.addHeader(ReqHeaderConstants.APP_ID, profile.getAppId());
            if (profile.getSdkId() != null) {
                data.addHeader(ReqHeaderConstants.SDK_ID, profile.getSdkId());
            }
            String signFormat = "%s\nX-TC-Key=%s&X-TC-Nonce=%s&X-TC-Timestamp=%s\n%s\n";
            String tobeSign = String.format(signFormat, data.getMethod(), profile.getSecretId(), nonce, timestamp,
                    data.getUri());
            if (data.getBody() != null) {
                tobeSign += data.getBody();
            }
            data.addHeader(ReqHeaderConstants.SIGNATURE, SignUtil.getSign(tobeSign, profile.getSecretKey()));
        }
    }

    /**
     * 自定义拦截器
     *
     * @param interceptor 自定义实现的请求拦截器
     */
    public void addInterceptors(Interceptor interceptor) {
        this.httpConnection.addInterceptors(interceptor);
    }

    /**
     * 发起请求
     *
     * @param data 封装请求数据
     * @param <O>  返回对象
     * @return O
     * @throws WemeetSdkException 请求异常
     */
    public <O extends BaseResponse> O request(AbstractModel data, TypeToken<O> typeToken) throws WemeetSdkException {
        return internalRequest(data, typeToken);
    }


    /**
     * 发起调用
     */
    protected <O extends BaseResponse> O internalRequest(AbstractModel data, TypeToken<O> typeToken) throws WemeetSdkException {
        Request request;
        try {
            Request.Builder builder = new Request.Builder();
            this.sign.addSignHeader(data, profile);
            if (data.getHeaders() != null && data.getHeaders().size() > 0) {
                builder.headers(Headers.of(data.getHeaders()));
            }

            builder.url(profile.getHost() + data.getUri());

            RequestBody requestBody = null;
            String body = data.getBody();
            if (body != null) {
                requestBody = RequestBody.create(data.contentType(), body);
            }
            builder.method(data.getMethod().name(), requestBody);
            request = builder.build();
        } catch (IllegalArgumentException e) {
            throw new WemeetSdkException(e.getClass().getName() + "-" + e.getMessage());
        }

        Response response = httpConnection.doRequest(request);
        String respBody;
        try {
            respBody = response.body().string();
        } catch (IOException e) {
            String msg = "Cannot transfer response body to string, because Content-Length is too large," +
                    " or Content-Length and stream length disagree.";
            throw new WemeetSdkException(msg);
        }
        O resp;
        try {
            resp = gson.fromJson(respBody, typeToken.getType());
        } catch (JsonSyntaxException e) {
            String msg = "json is not a valid representation for an object of type";
            throw new WemeetSdkException(msg);
        }
        if (response.code() != HTTP_RSP_OK) {
            String traceId = response.header("X-TC-Trace");
            validWemeetResp(resp, traceId);
            String msg = "trace id is " + traceId + ",response code is " + response.code() + ", not 200";
            throw new WemeetSdkException(msg);
        }
        return resp;
    }

    /**
     * 校验会议开放平台返回body
     *
     * @param response 返回body
     * @param traceId  返回请求id
     * @throws WemeetSdkException 会议自定义异常
     */
    public static void validWemeetResp(BaseResponse response, String traceId) throws WemeetSdkException {
        if (response == null) {
            throw new WemeetSdkException("resp is null");
        }
        if (response.getErrorInfo() != null) {
            BaseResponse.ErrorInfo errorInfo = response.getErrorInfo();
            throw new WemeetSdkException(errorInfo.getErrorCode(), "trace id is:" + traceId + ",error msg:"
                    + errorInfo.getMessage());
        }
    }
}
