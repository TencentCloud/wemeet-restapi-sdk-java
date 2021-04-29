package com.tencentcloudapi.wemeet.models.live;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;
import com.tencentcloudapi.wemeet.models.AbstractModel;
import com.tencentcloudapi.wemeet.models.LiveConfig;

/**
 * <p>通过会议id修改直播配置</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class ModifyLiveByIdRequest extends AbstractModel {
    /**
     * 会议id
     */
    private String meetingId;
    /**
     * 用户id
     */
    @Expose
    @SerializedName("userid")
    private String userId;
    /**
     * 用户的终端设备类型：
     * 1：PC
     * 2：Mac
     * 3：Android
     * 4：iOS
     * 5：Web
     * 6：iPad
     * 7：Android Pad
     * 8：小程序
     */
    @Expose
    @SerializedName("instanceid")
    private Integer instanceId;
    /**
     * 直播配置
     */
    @Expose
    @SerializedName("live_config")
    private LiveConfig liveConfig;

    @Override
    public String getPath() {
        return "/v1/meetings/" + this.meetingId + "/live_play/config";
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

    public Integer getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Integer instanceId) {
        this.instanceId = instanceId;
    }

    public LiveConfig getLiveConfig() {
        return liveConfig;
    }

    public void setLiveConfig(LiveConfig liveConfig) {
        this.liveConfig = liveConfig;
    }
}
