package com.tencentcloudapi.wemeet.common.profile;

/**
 * <p>http 请求配置信息</p>
 *
 * @author tencent
 * @date 2021/4/13
 */
public class HttpProfile {
    /**
     * Time unit, 1 minute, equals 60 seconds.
     */
    public static final int TM_MINUTE = 60;
    // 通用配置
    /**
     * host means request host name, such as https://api.meeting.qq.com 必传
     */
    private String host;

    /**
     * Read timeout in seconds.
     */
    private int readTimeout;

    /**
     * Write timeout in seconds
     */
    private int writeTimeout;

    /**
     * Connect timeout in seconds
     */
    private int connTimeout;
    /**
     * 是否开启请求debug日志
     */
    private boolean debug;

    // ********** 企业内部应用鉴权必传 **********

    /**
     * 申请的安全凭证密钥对中的 SecretId，传入请求header，对应X-TC-Key
     */
    private String secretId;
    /**
     * 申请的安全凭证密钥对中的 Secretkey，用户签名计算
     */
    private String secretKey;
    /**
     * 腾讯会议分配给三方开发应用的 App ID。企业管理员可以登录 腾讯会议官网，单击右上角【用户中心】
     * 在左侧菜单栏中的【企业管理】>【高级】>【restApi】中进行查看。
     */
    private String appId;
    /**
     * 用户子账号或开发的应用 ID，企业管理员可以登录 腾讯会议官网，单击右上角【用户中心】
     * 在左侧菜单栏中的【企业管理】>【高级】>【restApi】中进行查看（如存在 SdkId 则必须填写，早期申请 API 且未分配 SdkId 的客户可不填写）。
     */
    private String sdkId;
    // ********** 企业内部应用鉴权必传 **********


    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public String getSecretId() {
        return secretId;
    }

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSdkId() {
        return sdkId;
    }

    public void setSdkId(String sdkId) {
        this.sdkId = sdkId;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    public int getWriteTimeout() {
        return writeTimeout;
    }

    public void setWriteTimeout(int writeTimeout) {
        this.writeTimeout = writeTimeout;
    }

    public int getConnTimeout() {
        return connTimeout;
    }

    public void setConnTimeout(int connTimeout) {
        this.connTimeout = connTimeout;
    }
}
