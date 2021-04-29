package com.tencentcloudapi.wemeet.models.live;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tencentcloudapi.wemeet.models.BaseResponse;

import java.util.List;

/**
 * <p>查询直播回看返回</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class QueryLiveReplayResponse extends BaseResponse {
    @SerializedName("meeting_number")
    @Expose
    private Integer meetingNumber;
    @SerializedName("meeting_info_list")
    @Expose
    private List<LiveMeeting> meetingInfoList;

    public static class LiveMeeting {
        @Expose
        @SerializedName("meeting_id")
        private String meetingId;
        @Expose
        @SerializedName("meeting_code")
        private String meetingCode;
        @Expose
        @SerializedName("subject")
        private String subject;
        @Expose
        @SerializedName("live_replay_list")
        private List<LiveReplay> liveReplays;

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

        public List<LiveReplay> getLiveReplays() {
            return liveReplays;
        }

        public void setLiveReplays(List<LiveReplay> liveReplays) {
            this.liveReplays = liveReplays;
        }
    }

    public static class LiveReplay {
        @Expose
        @SerializedName("live_room_id")
        private String liveRoomId;
        @Expose
        @SerializedName("live_subject")
        private String liveSubject;
        @Expose
        @SerializedName("video_url")
        private String videoUrl;

        public String getLiveRoomId() {
            return liveRoomId;
        }

        public void setLiveRoomId(String liveRoomId) {
            this.liveRoomId = liveRoomId;
        }

        public String getLiveSubject() {
            return liveSubject;
        }

        public void setLiveSubject(String liveSubject) {
            this.liveSubject = liveSubject;
        }

        public String getVideoUrl() {
            return videoUrl;
        }

        public void setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
        }
    }

    public Integer getMeetingNumber() {
        return meetingNumber;
    }

    public void setMeetingNumber(Integer meetingNumber) {
        this.meetingNumber = meetingNumber;
    }

    public List<LiveMeeting> getMeetingInfoList() {
        return meetingInfoList;
    }

    public void setMeetingInfoList(List<LiveMeeting> meetingInfoList) {
        this.meetingInfoList = meetingInfoList;
    }
}
