package com.tencentcloudapi.wemeet.models.corp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * <p>企业账户级会议信息</p>
 *
 * @author tencent
 * @date 2021/4/29
 */
public class CorpMeetingInfo {
    /**
     * 会议id
     */
    @Expose
    @SerializedName("meeting_id")
    private String meetingId;
    /**
     * 会议 Code
     */
    @Expose
    @SerializedName("meeting_code")
    private String meetingCode;
    /**
     * 会议主题
     */
    @Expose
    @SerializedName("subject")
    private String subject;
    /**
     * 创建者 userid
     */
    @Expose
    @SerializedName("userid")
    private String userId;
    /**
     * 创建者昵称
     */
    @Expose
    @SerializedName("nick_name")
    private String nickName;
    /**
     * 会议开始时间，媒体房间维度，单位毫秒
     */
    @Expose
    @SerializedName("start_time")
    private Integer startTime;
    /**
     * 会议结束时间，媒体房间维度，单位毫秒
     */
    @Expose
    @SerializedName("end_time")
    private Integer endTime;

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public String getMeetingCode() {
        return meetingCode;
    }

    public void setMeetingCode(String meetingCode) {
        this.meetingCode = meetingCode;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }
}
