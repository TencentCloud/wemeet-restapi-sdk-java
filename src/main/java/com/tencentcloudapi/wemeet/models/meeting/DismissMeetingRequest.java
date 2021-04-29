package com.tencentcloudapi.wemeet.models.meeting;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;
import com.tencentcloudapi.wemeet.models.AbstractModel;

/**
 * <p>结束会议请求参数</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class DismissMeetingRequest extends AbstractModel {
    /**
     * 会议的唯一 ID
     */
    private String meetingId;
    /**
     * 调用 API 的用户 ID（企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId）。
     * 企业唯一用户标识说明：
     * 1. 企业对接 SSO 时使用的员工唯一标识 ID；
     * 2. 企业调用创建用户接口时传递的 userid 参数
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
     * 原因代码，可为用户自定义。
     */
    @Expose
    @SerializedName("reason_code")
    private Integer reasonCode;
    /**
     * 详细取消原因描述。
     */
    @Expose
    @SerializedName("reason_detail")
    private String reasonDetail;
    /**
     * 是否强制结束会议，默认值为1。
     * 0：不强制结束会议，会议中有参会者，则无法强制结束会议。
     * 1 ：强制结束会议，会议中有参会者，也会强制结束会议
     */
    @Expose
    @SerializedName("force_dismiss_meeting")
    private Integer forceDismissMeeting;
    /**
     * 是否回收会议号，默认值为0。
     * 0：不回收会议号，可以重新入会。
     * 1： 回收会议号，不可重新入会
     */
    @Expose
    @SerializedName("retrieve_code")
    private String retrieveCode;

    @Override
    public String getPath() {
        return "/v1/meetings/" + this.meetingId + "/dismiss";
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
        return HttpMethodEnum.POST;
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

    public Integer getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(Integer reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getReasonDetail() {
        return reasonDetail;
    }

    public void setReasonDetail(String reasonDetail) {
        this.reasonDetail = reasonDetail;
    }

    public Integer getForceDismissMeeting() {
        return forceDismissMeeting;
    }

    public void setForceDismissMeeting(Integer forceDismissMeeting) {
        this.forceDismissMeeting = forceDismissMeeting;
    }

    public String getRetrieveCode() {
        return retrieveCode;
    }

    public void setRetrieveCode(String retrieveCode) {
        this.retrieveCode = retrieveCode;
    }
}
