package com.tencentcloudapi.wemeet.models.corp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tencentcloudapi.wemeet.models.BaseResponse;

import java.util.List;

/**
 * <p>查询账户级已结束会议列表返回</p>
 *
 * @author tencent
 * @date 2021/4/29
 */
public class QueryCorpEndedMeetingsResponse extends BaseResponse {
    @Expose
    @SerializedName("total_count")
    private Integer totalCount;
    @Expose
    @SerializedName("current_size")
    private Integer currentSize;
    @Expose
    @SerializedName("current_page")
    private Integer currentPage;
    @Expose
    @SerializedName("total_page")
    private Integer totalPage;
    @Expose
    @SerializedName("meeting_info_list")
    private List<CorpEndedMeeting> meetingInfoList;

    public static class CorpEndedMeeting extends CorpMeetingInfo {
        /**
         * 参会人数
         */
        @Expose
        @SerializedName("participants_num")
        private Integer participantsNum;
        /**
         * 会议持续时长，单位毫秒
         */
        @Expose
        @SerializedName("meeting_duration")
        private String meetingDuration;
        /**
         * 用户会议时长，单位毫秒
         */
        @Expose
        @SerializedName("user_meeting_duration")
        private String userMeetingDuration;

        public Integer getParticipantsNum() {
            return participantsNum;
        }

        public void setParticipantsNum(Integer participantsNum) {
            this.participantsNum = participantsNum;
        }

        public String getMeetingDuration() {
            return meetingDuration;
        }

        public void setMeetingDuration(String meetingDuration) {
            this.meetingDuration = meetingDuration;
        }

        public String getUserMeetingDuration() {
            return userMeetingDuration;
        }

        public void setUserMeetingDuration(String userMeetingDuration) {
            this.userMeetingDuration = userMeetingDuration;
        }
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(Integer currentSize) {
        this.currentSize = currentSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<CorpEndedMeeting> getMeetingInfoList() {
        return meetingInfoList;
    }

    public void setMeetingInfoList(List<CorpEndedMeeting> meetingInfoList) {
        this.meetingInfoList = meetingInfoList;
    }
}
