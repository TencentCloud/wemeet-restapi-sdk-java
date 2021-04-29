package com.tencentcloudapi.wemeet.models.meeting;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tencentcloudapi.wemeet.models.BaseResponse;

import java.io.Serializable;
import java.util.List;

/**
 * <p>查询已结束会议列表返回参数</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class QueryEndedMeetingsResponse extends BaseResponse implements Serializable {
    @Expose
    @SerializedName("current_page")
    private Integer currentPage;
    @Expose
    @SerializedName("current_size")
    private Integer currentSize;
    @Expose
    @SerializedName("total_count")
    private Integer totalCount;
    @Expose
    @SerializedName("total_page")
    private Integer totalPage;
    @Expose
    @SerializedName("meeting_info_list")
    private List<EndedMeetingInfo> meetingInfoList;

    public static class EndedMeetingInfo {
        @Expose
        @SerializedName("subject")
        private String subject;
        @Expose
        @SerializedName("meeting_id")
        private String meetingId;
        @Expose
        @SerializedName("meeting_code")
        private String meetingCode;
        @Expose
        @SerializedName("start_time")
        private String startTime;
        @Expose
        @SerializedName("end_time")
        private String endTime;
        @Expose
        @SerializedName("meeting_type")
        private Integer meetingType;

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

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

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public Integer getMeetingType() {
            return meetingType;
        }

        public void setMeetingType(Integer meetingType) {
            this.meetingType = meetingType;
        }
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(Integer currentSize) {
        this.currentSize = currentSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<EndedMeetingInfo> getMeetingInfoList() {
        return meetingInfoList;
    }

    public void setMeetingInfoList(List<EndedMeetingInfo> meetingInfoList) {
        this.meetingInfoList = meetingInfoList;
    }
}
