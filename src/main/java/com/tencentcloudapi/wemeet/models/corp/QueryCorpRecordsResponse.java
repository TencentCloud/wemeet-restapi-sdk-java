package com.tencentcloudapi.wemeet.models.corp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tencentcloudapi.wemeet.models.BaseResponse;
import com.tencentcloudapi.wemeet.models.RecordFile;

import java.util.List;

/**
 * <p>查询账户级录制列表返回</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class QueryCorpRecordsResponse extends BaseResponse {
    /**
     * 分页查询返回数据总数
     */
    @Expose
    @SerializedName("total_count")
    private Integer totalCount;
    /**
     * 分页查询返回单页数据条数
     */
    @Expose
    @SerializedName("current_size")
    private Integer currentSize;
    /**
     * 分页查询返回当前页码
     */
    @Expose
    @SerializedName("current_page")
    private Integer currentPage;
    /**
     * 分页查询返回分页总数
     */
    @Expose
    @SerializedName("total_page")
    private Integer totalPage;
    /**
     * 会议录制列表
     */
    @Expose
    @SerializedName("record_meetings")
    private List<CorpMeetingRecord> records;

    public static class CorpMeetingRecord {
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
        @SerializedName("userid")
        private String userId;
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
        private List<CorpRecordFile> recordFiles;

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

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
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

        public List<CorpRecordFile> getRecordFiles() {
            return recordFiles;
        }

        public void setRecordFiles(List<CorpRecordFile> recordFiles) {
            this.recordFiles = recordFiles;
        }
    }

    public static class CorpRecordFile extends RecordFile {
        /**
         * 播放地址，开启共享时返回。
         */
        @Expose
        @SerializedName("view_address")
        private String viewAddress;
        /**
         * 下载地址，过期时间6小时，允许下载和开启共享时返回
         */
        @Expose
        @SerializedName("download_address")
        private String downloadAddress;

        public String getViewAddress() {
            return viewAddress;
        }

        public void setViewAddress(String viewAddress) {
            this.viewAddress = viewAddress;
        }

        public String getDownloadAddress() {
            return downloadAddress;
        }

        public void setDownloadAddress(String downloadAddress) {
            this.downloadAddress = downloadAddress;
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

    public List<CorpMeetingRecord> getRecords() {
        return records;
    }

    public void setRecords(List<CorpMeetingRecord> records) {
        this.records = records;
    }
}
