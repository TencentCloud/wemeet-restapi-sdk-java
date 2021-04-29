package com.tencentcloudapi.wemeet.models.meeting;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;
import com.tencentcloudapi.wemeet.models.AbstractModel;

/**
 * <p>取消会议请求参数</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class CancelMeetingRequest extends AbstractModel {
    private String meetingId;
    @Expose
    @SerializedName("userid")
    private String userId;
    @Expose
    @SerializedName("instanceid")
    private Integer instanceId;
    @Expose
    @SerializedName("reason_code")
    private Integer reasonCode;
    @Expose
    @SerializedName("meeting_type")
    private Integer meetingType;
    @Expose
    @SerializedName("sub_meeting_id")
    private String subMeetingId;
    @Expose
    @SerializedName("reason_detail")
    private String reasonDetail;


    @Override
    public String getPath() {
        return "/v1/meetings/" + this.meetingId + "/cancel";
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

    public Integer getMeetingType() {
        return meetingType;
    }

    public void setMeetingType(Integer meetingType) {
        this.meetingType = meetingType;
    }

    public String getSubMeetingId() {
        return subMeetingId;
    }

    public void setSubMeetingId(String subMeetingId) {
        this.subMeetingId = subMeetingId;
    }

    public String getReasonDetail() {
        return reasonDetail;
    }

    public void setReasonDetail(String reasonDetail) {
        this.reasonDetail = reasonDetail;
    }
}
