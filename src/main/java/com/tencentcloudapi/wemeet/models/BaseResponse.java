package com.tencentcloudapi.wemeet.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * <p>返回基类</p>
 *
 * @author tencent
 * @date 2021/4/7
 */
public class BaseResponse {
    /**
     * 错误返回信息
     */
    @Expose
    @SerializedName("error_info")
    private ErrorInfo errorInfo;

    public static class ErrorInfo {
        /**
         * 错误码
         */
        @Expose
        @SerializedName("error_code")
        private Integer errorCode;
        /**
         * 新定义错误码
         */
        @Expose
        @SerializedName("new_error_code")
        private Integer newErrorCode;
        /**
         * 错误描述
         */
        @Expose
        @SerializedName("message")
        private String message;


        public Integer getErrorCode() {
            return errorCode;
        }

        public void setErrorCode(Integer errorCode) {
            this.errorCode = errorCode;
        }

        public Integer getNewErrorCode() {
            return newErrorCode;
        }

        public void setNewErrorCode(Integer newErrorCode) {
            this.newErrorCode = newErrorCode;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    public ErrorInfo getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }
}
