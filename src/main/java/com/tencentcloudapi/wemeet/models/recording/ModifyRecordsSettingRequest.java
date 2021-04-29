package com.tencentcloudapi.wemeet.models.recording;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;
import com.tencentcloudapi.wemeet.models.AbstractModel;

/**
 * <p>修改会议录制共享设置请求参数</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class ModifyRecordsSettingRequest extends AbstractModel {
    /**
     * 会议录制 ID，列表查询接口返回的 meeting_record_id
     */
    private String meetingRecordId;
    /**
     * 会议ID
     */
    @Expose
    @SerializedName("meeting_id")
    private String meetingId;
    @Expose
    @SerializedName("userid")
    private String userId;
    /**
     * 共享配置信息
     */
    @Expose
    @SerializedName("sharing_config")
    private SharingConfig sharingConfig;

    public static class SharingConfig {
        /**
         * 共享开关，是否开启共享，默认为 true。
         * true：开启
         * false：未开启
         * 说明：
         * 未开启时不允许设置以下参数。
         * 修改为 false 关闭共享后，之前设置的共享设置将不保存。
         */
        @Expose
        @SerializedName("enable_sharing")
        private Boolean enableSharing;
        /**
         * 共享权限类型，默认为2。
         * 0：允许所有人查看
         * 1：仅企业用户成员可查看
         * 2：仅参会成员可查看
         */
        @Expose
        @SerializedName("sharing_auth_type")
        private Integer sharingAuthType;
        /**
         * 是否开启密码，默认为 true。
         * true：开启
         */
        @Expose
        @SerializedName("enable_password")
        private Boolean enablePassword;
        /**
         * 共享密码，默认随机生成。
         * 说明：当 enable_password = true 时，必传；当 enable_password = false 时，不可传。
         */
        @Expose
        @SerializedName("password")
        private String password;
        /**
         * 是否开启共享链接有效期，默认为 false。
         * true：开启
         */
        @Expose
        @SerializedName("enable_sharing_expire")
        private Boolean enableSharingExpire;
        /**
         * 共享链接有效期，unix 时间戳（单位毫秒），默认为空。
         * 说明：当 enable_sharing_expire = true 时，必传；当 enable_sharing_expire = false 时，不可传。
         */
        @Expose
        @SerializedName("sharing_expire")
        private Integer sharingExpire;
        /**
         * 是否允许下载，默认为 false。
         * true：允许下载
         */
        @Expose
        @SerializedName("allow_download")
        private Boolean allowDownload;

        public Boolean getEnableSharing() {
            return enableSharing;
        }

        public void setEnableSharing(Boolean enableSharing) {
            this.enableSharing = enableSharing;
        }

        public Integer getSharingAuthType() {
            return sharingAuthType;
        }

        public void setSharingAuthType(Integer sharingAuthType) {
            this.sharingAuthType = sharingAuthType;
        }

        public Boolean getEnablePassword() {
            return enablePassword;
        }

        public void setEnablePassword(Boolean enablePassword) {
            this.enablePassword = enablePassword;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Boolean getEnableSharingExpire() {
            return enableSharingExpire;
        }

        public void setEnableSharingExpire(Boolean enableSharingExpire) {
            this.enableSharingExpire = enableSharingExpire;
        }

        public Integer getSharingExpire() {
            return sharingExpire;
        }

        public void setSharingExpire(Integer sharingExpire) {
            this.sharingExpire = sharingExpire;
        }

        public Boolean getAllowDownload() {
            return allowDownload;
        }

        public void setAllowDownload(Boolean allowDownload) {
            this.allowDownload = allowDownload;
        }
    }


    @Override
    public String getPath() {
        return "/v1/records/settings/" + this.meetingRecordId;
    }

    @Override
    public String getBody() {
        return GSON.toJson(this);
    }

    @Override
    public MediaType contentType() {
        return MediaType.parse(MEDIA_TYPE_APPLICATION_JSON);
    }

    @Override
    public HttpMethodEnum getMethod() {
        return HttpMethodEnum.PUT;
    }

    public String getMeetingRecordId() {
        return meetingRecordId;
    }

    public void setMeetingRecordId(String meetingRecordId) {
        this.meetingRecordId = meetingRecordId;
    }

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public SharingConfig getSharingConfig() {
        return sharingConfig;
    }

    public void setSharingConfig(SharingConfig sharingConfig) {
        this.sharingConfig = sharingConfig;
    }
}
