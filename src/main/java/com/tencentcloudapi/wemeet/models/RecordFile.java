package com.tencentcloudapi.wemeet.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * <p>录制文件对象</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class RecordFile {
    /**
     * 录制文件 ID
     */
    @Expose
    @SerializedName("record_file_id")
    private String recordFileId;
    /**
     * 开始录制时间，UNIX 时间戳（单位毫秒）
     */
    @Expose
    @SerializedName("record_start_time")
    private Integer recordStartTime;
    /**
     * 结束录制时间，UNIX 时间戳（单位毫秒）
     */
    @Expose
    @SerializedName("record_end_time")
    private Integer recordEndTime;
    /**
     * 文件大小（单位字节）
     */
    @Expose
    @SerializedName("record_size")
    private Integer recordSize;
    /**
     * 共享状态，是否开启共享。
     * 0：未开启
     * 1：开启
     * 当开启共享时返回访问权限、访问密码、共享链接有效期、是否允许下载。
     */
    @Expose
    @SerializedName("sharing_state")
    private Integer sharingState;
    /**
     * 共享链接，开启共享时返回。
     */
    @Expose
    @SerializedName("sharing_url")
    private String sharingUrl;
    /**
     * 仅企业用户可查看，开启共享时返回
     */
    @Expose
    @SerializedName("required_same_corp")
    private Boolean requiredSameCorp;
    /**
     * 仅参会成员可查看，开启共享时返回
     */
    @Expose
    @SerializedName("required_participant")
    private Boolean requiredParticipant;
    /**
     * 访问密码，开启共享时返回。
     */
    @Expose
    @SerializedName("password")
    private String password;
    /**
     * 共享链接有效期（单位毫秒），当未开启共享时，返回0表示永久有效；开启共享时返回。
     */
    @Expose
    @SerializedName("sharing_expire")
    private Integer sharingExpire;
    /**
     * 是否允许下载，开启共享时返回
     */
    @Expose
    @SerializedName("allow_download")
    private Boolean allowDownload;

    public String getRecordFileId() {
        return recordFileId;
    }

    public void setRecordFileId(String recordFileId) {
        this.recordFileId = recordFileId;
    }

    public Integer getRecordStartTime() {
        return recordStartTime;
    }

    public void setRecordStartTime(Integer recordStartTime) {
        this.recordStartTime = recordStartTime;
    }

    public Integer getRecordEndTime() {
        return recordEndTime;
    }

    public void setRecordEndTime(Integer recordEndTime) {
        this.recordEndTime = recordEndTime;
    }

    public Integer getRecordSize() {
        return recordSize;
    }

    public void setRecordSize(Integer recordSize) {
        this.recordSize = recordSize;
    }

    public Integer getSharingState() {
        return sharingState;
    }

    public void setSharingState(Integer sharingState) {
        this.sharingState = sharingState;
    }

    public String getSharingUrl() {
        return sharingUrl;
    }

    public void setSharingUrl(String sharingUrl) {
        this.sharingUrl = sharingUrl;
    }

    public Boolean getRequiredSameCorp() {
        return requiredSameCorp;
    }

    public void setRequiredSameCorp(Boolean requiredSameCorp) {
        this.requiredSameCorp = requiredSameCorp;
    }

    public Boolean getRequiredParticipant() {
        return requiredParticipant;
    }

    public void setRequiredParticipant(Boolean requiredParticipant) {
        this.requiredParticipant = requiredParticipant;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSharingExpire() {
        return sharingExpire;
    }

    public void setSharingExpire(Integer sharingExpire) {
        this.sharingExpire = sharingExpire;
    }

    public Boolean getAllowDownload() {
        return allowDownload;
    }

    public void setAllowDownload(Boolean allowDownload) {
        this.allowDownload = allowDownload;
    }
}
