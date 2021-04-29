package com.tencentcloudapi.wemeet.models.recording;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tencentcloudapi.wemeet.models.BaseResponse;

import java.util.List;

/**
 * <p>desc</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class QueryMeetingAddressResponse extends BaseResponse {
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
    @SerializedName("subject")
    private String subject;
    @Expose
    @SerializedName("record_files")
    private List<AddressRecordFile> recordFiles;

    public static class AddressRecordFile {
        /**
         * 录制文件 ID
         */
        @Expose
        @SerializedName("record_file_id")
        private String recordFileId;
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

        public String getRecordFileId() {
            return recordFileId;
        }

        public void setRecordFileId(String recordFileId) {
            this.recordFileId = recordFileId;
        }

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<AddressRecordFile> getRecordFiles() {
        return recordFiles;
    }

    public void setRecordFiles(List<AddressRecordFile> recordFiles) {
        this.recordFiles = recordFiles;
    }
}
