package com.tencentcloudapi.wemeet.models.recording;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tencentcloudapi.wemeet.models.BaseResponse;
import com.tencentcloudapi.wemeet.models.RecordFile;

import java.util.List;

/**
 * <p>查询录制列表返回</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class QueryRecordsResponse extends BaseResponse {
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
    @SerializedName("record_meetings")
    private List<MeetingRecord> records;

    public static class MeetingRecord {
        @Expose
        @SerializedName("meeting_record_id")
        private String meetingRecordId;
        @Expose
        @SerializedName("meeting_id")
        private String meetingId;
        @Expose
        @SerializedName("meeting_code")
        private String meetingCode;
        @Expose
        @SerializedName("host_user_id")
        private String hostUserId;
        @Expose
        @SerializedName("media_start_time")
        private Integer mediaStartTime;
        @Expose
        @SerializedName("subject")
        private String subject;
        @Expose
        @SerializedName("state")
        private Integer state;
        @Expose
        @SerializedName("record_files")
        private List<RecordFile> recordFiles;

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

        public String getMeetingCode() {
            return meetingCode;
        }

        public void setMeetingCode(String meetingCode) {
            this.meetingCode = meetingCode;
        }

        public String getHostUserId() {
            return hostUserId;
        }

        public void setHostUserId(String hostUserId) {
            this.hostUserId = hostUserId;
        }

        public Integer getMediaStartTime() {
            return mediaStartTime;
        }

        public void setMediaStartTime(Integer mediaStartTime) {
            this.mediaStartTime = mediaStartTime;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public Integer getState() {
            return state;
        }

        public void setState(Integer state) {
            this.state = state;
        }

        public List<RecordFile> getRecordFiles() {
            return recordFiles;
        }

        public void setRecordFiles(List<RecordFile> recordFiles) {
            this.recordFiles = recordFiles;
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

    public List<MeetingRecord> getRecords() {
        return records;
    }

    public void setRecords(List<MeetingRecord> records) {
        this.records = records;
    }
}
