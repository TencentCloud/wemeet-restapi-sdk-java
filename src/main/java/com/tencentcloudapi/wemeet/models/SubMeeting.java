package com.tencentcloudapi.wemeet.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * <p>子会议对象</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class SubMeeting {
    @Expose
    @SerializedName("sub_meeting_id")
    private String subMeetingId;
    @Expose
    @SerializedName("status")
    private Integer status;
    @Expose
    @SerializedName("start_time")
    private Integer startTime;
    @Expose
    @SerializedName("end_time")
    private Integer endTime;

    public String getSubMeetingId() {
        return subMeetingId;
    }

    public void setSubMeetingId(String subMeetingId) {
        this.subMeetingId = subMeetingId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
