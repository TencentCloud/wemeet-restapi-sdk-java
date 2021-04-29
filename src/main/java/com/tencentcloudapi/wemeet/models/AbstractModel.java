package com.tencentcloudapi.wemeet.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>model抽象类</p>
 *
 * @author tencent
 * @date 2021/4/26
 */
public abstract class AbstractModel {
    /**
     * post json media type
     */
    protected static final String MEDIA_TYPE_APPLICATION_JSON = "application/json";
    /**
     * gson
     */
    protected static final Gson GSON = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    /**
     * url路径参数
     */
    private Map<String, String> params;
    /**
     * 请求headers
     */
    private Map<String, String> headers;
    /**
     * 请求路径加请求参数，使用方不需要设置
     */
    private String uri;

    /**
     * 获取请求路径
     *
     * @return eg:/v1/meetings/1124121
     */
    public abstract String getPath();

    /**
     * 获取请求body数据
     *
     * @return json
     */
    public abstract String getBody();

    /**
     * 设置content type
     *
     * @return eg: application/json
     */
    public abstract MediaType contentType();

    /**
     * 返回http的请求方式
     *
     * @return http请求方式
     */
    public abstract HttpMethodEnum getMethod();

    public Map<String, String> getParams() {
        return params;
    }

    /**
     * 添加path参数
     *
     * @param key key
     * @param val value
     */
    public void addParams(String key, String val) {
        if (key == null || "".equals(key)) {
            return;
        }
        if (val == null || "".equals(val)) {
            return;
        }
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        this.params.put(key, val);
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * 添加请求header，可添加自定义header
     * 说明：如果使用OAuth2.0方式鉴权，必须添加以下两个key
     * ReqHeaderConstants.ACCESS_TOKEN
     * ReqHeaderConstants.OPEN_ID
     *
     * @param key key
     * @param val value
     */
    public void addHeader(String key, String val) {
        if (key == null || "".equals(key)) {
            return;
        }
        if (val == null || "".equals(val)) {
            return;
        }
        if (this.headers == null) {
            this.headers = new HashMap<>();
        }
        this.headers.put(key, val);
    }

    /**
     * 获取请求地址
     *
     * @return eg:/v1/meetings/2121515?userid=test&instanceid=1
     */
    public String getUri() {
        if (this.uri == null) {
            StringBuilder url = new StringBuilder(this.getPath());
            if (this.getParams() != null && this.getParams().size() > 0) {
                url.append("?");
                Map<String, String> params = this.getParams();
                for (Map.Entry<String, String> entry : params.entrySet()) {
                    url.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
                }
                url.deleteCharAt(url.lastIndexOf("&"));
            }
            if (url.charAt(0) != '/') {
                url.insert(0, '/');
            }
            this.uri = url.toString();
        }
        return uri;
    }
}
