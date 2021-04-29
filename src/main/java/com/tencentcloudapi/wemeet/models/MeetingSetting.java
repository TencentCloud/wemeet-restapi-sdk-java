package com.tencentcloudapi.wemeet.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * <p>会议媒体参数配置对象</p>
 *
 * @author tencent
 * @date 2021/4/26
 */
public class MeetingSetting {
    /**
     * 入会时静音。 必传
     */
    @Expose
    @SerializedName("mute_enable_join")
    private Boolean muteEnableJoin;
    /**
     * 允许参会者取消静音（暂不支持）
     */
    @Expose
    @SerializedName("allow_unmute_self")
    private Boolean allowUnmuteSelf;
    /**
     * 全体静音
     */
    @Expose
    @SerializedName("mute_all")
    private Boolean muteAll;
    /**
     * 入会时主持人视频是否开启，暂时不支持
     */
    @Expose
    @SerializedName("host_video")
    private Boolean hostVideo;
    /**
     * 入会时参会者视频是否开启，暂时不支持
     */
    @Expose
    @SerializedName("participant_video")
    private Boolean participantVideo;
    /**
     * 参会者离开时播放提示音，暂时不支持，可在客户端设置
     */
    @Expose
    @SerializedName("play_ivr_on_leave")
    private Boolean playIvrOnLeave;
    /**
     * 有新的与会者加入时播放提示音，暂不支持，可在客户端设置
     */
    @Expose
    @SerializedName("play_ivr_on_join")
    private Boolean playIvrOnJoin;
    /**
     * 是否允许成员在主持人进会前加入会议，默认值为 true。
     * true：允许
     * false：不允许
     */
    @Expose
    @SerializedName("allow_in_before_host")
    private Boolean allowInBeforeHost;
    /**
     * 是否开启等候室，默认值为 false。
     * true：开启
     * false：不开启
     */
    @Expose
    @SerializedName("auto_in_waiting_room")
    private Boolean autoInWaitingRoom;
    /**
     * 是否开启屏幕共享水印，默认值为 false。
     * true： 开启
     * false：不开启
     */
    @Expose
    @SerializedName("allow_screen_shared_watermark")
    private Boolean allowScreenSharedWatermark;
    /**
     * 水印样式，默认为单排。当屏幕共享水印参数为开启时，此参数才生效。
     * 0：单排
     * 1：多排
     */
    @Expose
    @SerializedName("water_mark_type")
    private Integer waterMarkType;
    /**
     * 是否仅企业内部成员可入会，默认值为 false。
     * true：仅企业内部用户可入会
     * false：所有人可入会
     */
    @Expose
    @SerializedName("only_enterprise_user_allowed")
    private Boolean onlyEnterpriseUserAllowed;
    /**
     * 自动会议录制类型。
     * none：禁用，表示不开启自动会议录制。
     * local：本地录制，表示主持人入会后自动开启本地录制。
     * cloud：云录制，表示主持人入会后自动开启云录制。
     * 说明：
     * 该参数依赖企业账户设置，当企业强制锁定后，该参数必须与企业配置保持一致。
     * 仅客户端2.7及以上版本可生效。
     */
    @Expose
    @SerializedName("auto_record_type")
    private String autoRecordType;
    /**
     * 当有参会成员入会时立即开启云录制，默认值为 false 关闭，关闭时，主持人入会自动开启云录制；当设置为开启时，则有参会成员入会自动开启云录制。
     * 说明：
     * 该参数必须 auto_record_type 设置为“cloud”时才生效，该参数依赖企业账户设置，当企业强制锁定后，该参数必须与企业配置保持一致。
     * 仅客户端2.7及以上版本生效。
     */
    @Expose
    @SerializedName("participant_join_auto_record")
    private Boolean participantJoinAutoRecord;
    /**
     * 允许主持人暂停或者停止云录制，默认值为 true 开启，开启时，主持人允许暂停和停止云录制；当设置为关闭时，则主持人不允许暂停和关闭云录制。
     * 说明：
     * 该参数必须 auto_record_type 设置为“cloud”时才生效，该参数依赖企业账户设置，当企业强制锁定后，该参数必须与企业配置保持一致。
     * 仅客户端2.7及以上版本生效。
     */
    @Expose
    @SerializedName("enable_host_pause_auto_record")
    private Boolean enableHostPauseAutoRecord;

    public Boolean getMuteEnableJoin() {
        return muteEnableJoin;
    }

    public void setMuteEnableJoin(Boolean muteEnableJoin) {
        this.muteEnableJoin = muteEnableJoin;
    }

    public Boolean getAllowUnmuteSelf() {
        return allowUnmuteSelf;
    }

    public void setAllowUnmuteSelf(Boolean allowUnmuteSelf) {
        this.allowUnmuteSelf = allowUnmuteSelf;
    }

    public Boolean getMuteAll() {
        return muteAll;
    }

    public void setMuteAll(Boolean muteAll) {
        this.muteAll = muteAll;
    }

    public Boolean getHostVideo() {
        return hostVideo;
    }

    public void setHostVideo(Boolean hostVideo) {
        this.hostVideo = hostVideo;
    }

    public Boolean getParticipantVideo() {
        return participantVideo;
    }

    public void setParticipantVideo(Boolean participantVideo) {
        this.participantVideo = participantVideo;
    }

    public Boolean getPlayIvrOnLeave() {
        return playIvrOnLeave;
    }

    public void setPlayIvrOnLeave(Boolean playIvrOnLeave) {
        this.playIvrOnLeave = playIvrOnLeave;
    }

    public Boolean getPlayIvrOnJoin() {
        return playIvrOnJoin;
    }

    public void setPlayIvrOnJoin(Boolean playIvrOnJoin) {
        this.playIvrOnJoin = playIvrOnJoin;
    }

    public Boolean getAllowInBeforeHost() {
        return allowInBeforeHost;
    }

    public void setAllowInBeforeHost(Boolean allowInBeforeHost) {
        this.allowInBeforeHost = allowInBeforeHost;
    }

    public Boolean getAutoInWaitingRoom() {
        return autoInWaitingRoom;
    }

    public void setAutoInWaitingRoom(Boolean autoInWaitingRoom) {
        this.autoInWaitingRoom = autoInWaitingRoom;
    }

    public Boolean getAllowScreenSharedWatermark() {
        return allowScreenSharedWatermark;
    }

    public void setAllowScreenSharedWatermark(Boolean allowScreenSharedWatermark) {
        this.allowScreenSharedWatermark = allowScreenSharedWatermark;
    }

    public Integer getWaterMarkType() {
        return waterMarkType;
    }

    public void setWaterMarkType(Integer waterMarkType) {
        this.waterMarkType = waterMarkType;
    }

    public Boolean getOnlyEnterpriseUserAllowed() {
        return onlyEnterpriseUserAllowed;
    }

    public void setOnlyEnterpriseUserAllowed(Boolean onlyEnterpriseUserAllowed) {
        this.onlyEnterpriseUserAllowed = onlyEnterpriseUserAllowed;
    }

    public String getAutoRecordType() {
        return autoRecordType;
    }

    public void setAutoRecordType(String autoRecordType) {
        this.autoRecordType = autoRecordType;
    }

    public Boolean getParticipantJoinAutoRecord() {
        return participantJoinAutoRecord;
    }

    public void setParticipantJoinAutoRecord(Boolean participantJoinAutoRecord) {
        this.participantJoinAutoRecord = participantJoinAutoRecord;
    }

    public Boolean getEnableHostPauseAutoRecord() {
        return enableHostPauseAutoRecord;
    }

    public void setEnableHostPauseAutoRecord(Boolean enableHostPauseAutoRecord) {
        this.enableHostPauseAutoRecord = enableHostPauseAutoRecord;
    }
}
