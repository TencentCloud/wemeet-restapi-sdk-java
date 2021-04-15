package com.tencentcloudapi.wemeet.common.exception;

/**
 * <p>会议相关</p>
 *
 * @author tencent
 * @date 2021/4/6
 */
public class WemeetSdkException extends Exception {
    private int code;

    public WemeetSdkException(String message) {
        super(message);
    }

    public WemeetSdkException(int code, String message) {
        super(message);
        this.code = code;
    }
}
