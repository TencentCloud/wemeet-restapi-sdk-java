package com.tencentcloudapi.wemeet.models.recording;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tencentcloudapi.wemeet.models.BaseResponse;

/**
 * <p>查询单个录制地址返回</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class QueryFileAddressResponse extends BaseResponse {
    /**
     * 录制文件 ID
     */
    @Expose
    @SerializedName("record_file_id")
    private String recordFileId;
    @Expose
    @SerializedName("meeting_id")
    private String meetingId;
    @Expose
    @SerializedName("meeting_code")
    private String meetingCode;
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
