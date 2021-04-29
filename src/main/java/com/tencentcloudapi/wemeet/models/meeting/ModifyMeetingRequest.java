package com.tencentcloudapi.wemeet.models.meeting;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;
import com.tencentcloudapi.wemeet.models.*;

import java.util.List;

/**
 * <p>修改会议请求参数</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class ModifyMeetingRequest extends AbstractModel {
    private String meetingId;
    /**
     * 调用方用于标示用户的唯一 ID（企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId）。
     * 企业唯一用户标识说明：
     * 1. 企业对接 SSO 时使用的员工唯一标识 ID；
     * 2. 企业调用创建用户接口时传递的 userid 参数
     * 必传
     */
    @Expose
    @SerializedName("userid")
    private String userId;
    /**
     * 用户的终端设备类型：
     * 1：PC
     * 2：Mac
     * 3：Android
     * 4：iOS
     * 5：Web
     * 6：iPad
     * 7：Android Pad
     * 8：小程序
     * 创建会议时 userid 对应的设备类型，不影响入会时使用的设备类型，缺省可填1
     * 必传
     */
    @Expose
    @SerializedName("instanceid")
    private Integer instanceId;
    /**
     * 会议主题 必传
     */
    @Expose
    @SerializedName("subject")
    private String subject;
    /**
     * 会议指定主持人的用户 ID，如果无指定，主持人将被设定为参数 userid 的用户，即 API 调用者。
     * 注意：仅腾讯会议商业版和企业版可指定主持人
     */
    @Expose
    @SerializedName("hosts")
    private List<User> hosts;
    /**
     * 会议邀请的参会者，可为空。
     * 注意：仅腾讯会议商业版和企业版可邀请参会者
     */
    @Expose
    @SerializedName("invitees")
    private List<User> invitees;
    /**
     * 会议开始时间戳（单位秒）必传
     */
    @Expose
    @SerializedName("start_time")
    private String startTime;
    /**
     * 会议结束时间戳（单位秒） 必传
     */
    @Expose
    @SerializedName("end_time")
    private String endTime;
    /**
     * 会议密码（4~6位数字），可不填
     */
    @Expose
    @SerializedName("password")
    private String password;
    /**
     * 会议媒体参数配置
     */
    @Expose
    @SerializedName("settings")
    private MeetingSetting settings;
    /**
     * 默认值为0。
     * 0：普通会议
     * 1：周期性会议
     * 说明：周期性会议时 type 不能为快速会议。
     */
    @Expose
    @SerializedName("meeting_type")
    private Integer meetingType;
    /**
     * 周期性会议配置。
     */
    @Expose
    @SerializedName("recurring_rule")
    private RecurringRule recurringRule;
    /**
     * 是否开启直播。
     */
    @Expose
    @SerializedName("enable_live")
    private Boolean enableLive;
    /**
     * 直播配置。
     */
    @Expose
    @SerializedName("live_config")
    private LiveConfig liveConfig;
    /**
     * 会议室列表
     */
    @Expose
    @SerializedName("meeting_room_info_list")
    private List<MeetingRoomInfo> meetingRoomInfoList;
    /**
     * 是否允许成员上传文档，默认为允许
     */
    @Expose
    @SerializedName("enable_doc_upload_permission")
    private Boolean enableDocUploadPermission;
    /**
     * 会议嘉宾列表，会议嘉宾不受会议密码和等候室的限制
     */
    @Expose
    @SerializedName("guests")
    private List<Guest> guests;

    @Override
    public String getPath() {
        return "/v1/meetings/" + this.meetingId;
    }

    @Override
    public String getBody() {
        return GSON.toJson(this);
    }

    @Override
    public MediaType contentType() {
        return MediaType.parse(MEDIA_TYPE_APPLICATION_JSON);
    }

    @Override
    public HttpMethodEnum getMethod() {
        return HttpMethodEnum.PUT;
    }

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Integer instanceId) {
        this.instanceId = instanceId;
    }

    public List<MeetingRoomInfo> getMeetingRoomInfoList() {
        return meetingRoomInfoList;
    }

    public void setMeetingRoomInfoList(List<MeetingRoomInfo> meetingRoomInfoList) {
        this.meetingRoomInfoList = meetingRoomInfoList;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<User> getHosts() {
        return hosts;
    }

    public void setHosts(List<User> hosts) {
        this.hosts = hosts;
    }

    public List<User> getInvitees() {
        return invitees;
    }

    public void setInvitees(List<User> invitees) {
        this.invitees = invitees;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MeetingSetting getSettings() {
        return settings;
    }

    public void setSettings(MeetingSetting settings) {
        this.settings = settings;
    }

    public Integer getMeetingType() {
        return meetingType;
    }

    public void setMeetingType(Integer meetingType) {
        this.meetingType = meetingType;
    }

    public RecurringRule getRecurringRule() {
        return recurringRule;
    }

    public void setRecurringRule(RecurringRule recurringRule) {
        this.recurringRule = recurringRule;
    }

    public Boolean getEnableLive() {
        return enableLive;
    }

    public void setEnableLive(Boolean enableLive) {
        this.enableLive = enableLive;
    }

    public LiveConfig getLiveConfig() {
        return liveConfig;
    }

    public void setLiveConfig(LiveConfig liveConfig) {
        this.liveConfig = liveConfig;
    }

    public Boolean getEnableDocUploadPermission() {
        return enableDocUploadPermission;
    }

    public void setEnableDocUploadPermission(Boolean enableDocUploadPermission) {
        this.enableDocUploadPermission = enableDocUploadPermission;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }
}
