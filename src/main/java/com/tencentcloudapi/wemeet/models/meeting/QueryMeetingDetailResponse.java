package com.tencentcloudapi.wemeet.models.meeting;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tencentcloudapi.wemeet.models.BaseResponse;

import java.io.Serializable;
import java.util.List;

/**
 * <p>查询会议返回</p>
 *
 * @author tencent
 * @date 2021/4/6
 */
public class QueryMeetingDetailResponse extends BaseResponse implements Serializable {
    @SerializedName("meeting_number")
    @Expose
    private Integer meetingNumber;
    @SerializedName("meeting_info_list")
    @Expose
    private List<MeetingInfo> meetingInfoList;

    public static class MeetingInfo {
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
        @SerializedName("password")
        private String password;
        @Expose
        @SerializedName("need_password")
        private Boolean needPassword;
        @Expose
        private String status;
        @Expose
        private Integer type;
        @Expose
        @SerializedName("join_url")
        private String joinUrl;
        @Expose
        private List<UserInfo> hosts;
        @Expose
        @SerializedName("current_hosts")
        private List<UserInfo> currentHosts;
        @Expose
        @SerializedName("current_co_hosts")
        private List<UserInfo> currentCoHosts;
        @Expose
        private List<UserInfo> participants;
        @Expose
        private String startTime;
        @Expose
        private String endTime;
        @Expose
        private Settings settings;
        @Expose
        private Integer meetingType;
        @Expose
        private PeriodMeeting recurringRule;

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

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Boolean getNeedPassword() {
            return needPassword;
        }

        public void setNeedPassword(Boolean needPassword) {
            this.needPassword = needPassword;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public String getJoinUrl() {
            return joinUrl;
        }

        public void setJoinUrl(String joinUrl) {
            this.joinUrl = joinUrl;
        }

        public List<UserInfo> getHosts() {
            return hosts;
        }

        public void setHosts(List<UserInfo> hosts) {
            this.hosts = hosts;
        }

        public List<UserInfo> getCurrentHosts() {
            return currentHosts;
        }

        public void setCurrentHosts(List<UserInfo> currentHosts) {
            this.currentHosts = currentHosts;
        }

        public List<UserInfo> getCurrentCoHosts() {
            return currentCoHosts;
        }

        public void setCurrentCoHosts(List<UserInfo> currentCoHosts) {
            this.currentCoHosts = currentCoHosts;
        }

        public List<UserInfo> getParticipants() {
            return participants;
        }

        public void setParticipants(List<UserInfo> participants) {
            this.participants = participants;
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

        public Settings getSettings() {
            return settings;
        }

        public void setSettings(Settings settings) {
            this.settings = settings;
        }

        public Integer getMeetingType() {
            return meetingType;
        }

        public void setMeetingType(Integer meetingType) {
            this.meetingType = meetingType;
        }

        public PeriodMeeting getRecurringRule() {
            return recurringRule;
        }

        public void setRecurringRule(PeriodMeeting recurringRule) {
            this.recurringRule = recurringRule;
        }
    }

    public static class UserInfo {

    }

    public static class Settings {

    }

    public static class PeriodMeeting {

    }

    public Integer getMeetingNumber() {
        return meetingNumber;
    }

    public void setMeetingNumber(Integer meetingNumber) {
        this.meetingNumber = meetingNumber;
    }

    public List<MeetingInfo> getMeetingInfoList() {
        return meetingInfoList;
    }

    public void setMeetingInfoList(List<MeetingInfo> meetingInfoList) {
        this.meetingInfoList = meetingInfoList;
    }
}
