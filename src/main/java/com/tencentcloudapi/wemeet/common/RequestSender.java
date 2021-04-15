package com.tencentcloudapi.wemeet.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.*;
import com.tencentcloudapi.wemeet.common.exception.WemeetSdkException;
import com.tencentcloudapi.wemeet.common.http.HttpConnection;
import com.tencentcloudapi.wemeet.common.interceptor.TerminalLog;
import com.tencentcloudapi.wemeet.common.profile.HttpProfile;
import com.tencentcloudapi.wemeet.models.BaseResponse;
import com.tencentcloudapi.wemeet.util.SignUtil;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.Map;

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
        void addSignHeader(TerminalData data, HttpProfile profile) throws WemeetSdkException;
    }

    public static class DefaultSign implements Sign {
        private final Gson gson;

        public DefaultSign(Gson gson) {
            this.gson = gson;
        }

        @Override
        public void addSignHeader(TerminalData data, HttpProfile profile) throws WemeetSdkException {
            String nonce = String.valueOf(Math.abs(new SecureRandom().nextInt()));
            String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
            data.addHeader("X-TC-Nonce", nonce);
            data.addHeader("X-TC-Timestamp", timestamp);
            data.addHeader("X-TC-Key", profile.getSecretId());
            StringBuilder url = new StringBuilder(data.getUri());
            if (data.getParams() != null && data.getParams().size() > 0) {
                url.append("?");
                Map<String, String> params = data.getParams();
                for (Map.Entry<String, String> entry : params.entrySet()) {
                    url.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
                }
                url.deleteCharAt(url.lastIndexOf("&"));
            }
            if (url.charAt(0) != '/') {
                url.insert(0, '/');
            }
            data.setUri(url.toString());
            String tobeSign = data.getMethod() + "\nX-TC-Key=" + profile.getSecretId() + "&X-TC-Nonce="
                    + nonce + "&X-TC-Timestamp=" + timestamp + "\n"
                    + data.getUri() + "\n";
            if (data.getBody() != null) {
                String jsonBody = data.getBody() instanceof String ? (String) data.getBody() : gson.toJson(data.getBody());
                data.setBody(jsonBody);
                tobeSign += jsonBody;
            }
            data.addHeader("X-TC-Signature", SignUtil.getSign(tobeSign, profile.getSecretKey()));
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
    public <O extends BaseResponse> O request(TerminalData data, TypeToken<O> typeToken) throws WemeetSdkException {
        return internalRequest(data, null, typeToken);
    }

    /**
     * 发起请求
     *
     * @param data        封装请求数据
     * @param contentType 请求content-type
     * @param <O>         返回对象
     * @return O
     * @throws WemeetSdkException 请求异常
     */
    public <O extends BaseResponse> O request(TerminalData data, TypeToken<O> typeToken, MediaType contentType) throws WemeetSdkException {
        return internalRequest(data, contentType, typeToken);
    }

    protected <O extends BaseResponse> O internalRequest(TerminalData data, MediaType contentType, TypeToken<O> typeToken) throws WemeetSdkException {
        Request request;
        try {
            Request.Builder builder = new Request.Builder();
            this.sign.addSignHeader(data, profile);
            if (data.getHeaders() != null && data.getHeaders().size() > 0) {
                builder.headers(Headers.of(data.getHeaders()));
            }

            builder.url(profile.getHost() + data.getUri());

            RequestBody requestBody = null;
            Object body = data.getBody();
            if (body != null) {
                String jsonBody;
                if (body instanceof String) {
                    jsonBody = (String) body;
                } else {
                    jsonBody = gson.toJson(body);
                }
                requestBody = RequestBody.create(contentType, jsonBody);
            }
            builder.method(data.getMethod(), requestBody);
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
            if (resp != null && resp.getErrorInfo() != null) {
                BaseResponse.ErrorInfo errorInfo = resp.getErrorInfo();
                throw new WemeetSdkException(errorInfo.getErrorCode(), errorInfo.getMessage());
            }
            String msg = "response code is " + response.code() + ", not 200";
            throw new WemeetSdkException(msg);
        }
        return resp;
    }
}
