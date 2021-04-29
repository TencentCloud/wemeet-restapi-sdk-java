package com.tencentcloudapi.wemeet.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * <p>会议室对象</p>
 *
 * @author tencent
 * @date 2021/4/26
 */
public class MeetingRoomInfo {
    /**
     * 会议室id
     */
    @Expose
    @SerializedName("meeting_room_id")
    private String meetingRoomId;

    public String getMeetingRoomId() {
        return meetingRoomId;
    }

    public void setMeetingRoomId(String meetingRoomId) {
        this.meetingRoomId = meetingRoomId;
    }
}
