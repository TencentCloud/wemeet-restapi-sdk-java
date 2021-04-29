package com.tencentcloudapi.wemeet.models.meeting;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tencentcloudapi.wemeet.models.BaseResponse;

import java.io.Serializable;
import java.util.List;

/**
 * <p>查询参会成员返回参数</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class QueryParticipantsResponse extends BaseResponse implements Serializable {
    /**
     * 会议的唯一 ID。
     */
    @Expose
    @SerializedName("meeting_id")
    private String meetingId;
    /**
     * 会议号码
     */
    @Expose
    @SerializedName("meeting_code")
    private String meetingCode;
    /**
     * 会议主题
     */
    @Expose
    @SerializedName("subject")
    private String subject;
    /**
     * 预定会议开始时间戳（单位秒）
     */
    @Expose
    @SerializedName("schedule_start_time")
    private String scheduleStartTime;
    /**
     * 预定会议结束时间戳（单位秒）。
     */
    @Expose
    @SerializedName("schedule_end_time")
    private String scheduleEndTime;
    /**
     * 参会人员对象数组
     */
    @Expose
    @SerializedName("participants")
    private List<Participant> participants;
    /**
     * 是否还有未拉取的数据
     */
    @Expose
    @SerializedName("has_remaining")
    private Boolean hasRemaining;
    /**
     * 和“has_remaining”一起，数据量比较大的情况下支持参会成员列表的多次获取
     */
    @Expose
    @SerializedName("next_pos")
    private Integer nextPos;
    /**
     * 当前参会总人次
     */
    @Expose
    @SerializedName("total_count")
    private Integer totalCount;

    public static class Participant implements Serializable {
        /**
         * 参会者用户 ID（企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId）
         */
        @Expose
        @SerializedName("userid")
        private String userId;
        /**
         * 入会用户名（base64）
         */
        @Expose
        @SerializedName("user_name")
        private String userName;
        /**
         * 参会者手机号 hash 值 SHA256（手机号 + "/" + secretid）。
         */
        @Expose
        @SerializedName("phone")
        private String phone;
        /**
         * 参会者加入会议时间戳（单位秒）。
         */
        @Expose
        @SerializedName("join_time")
        private String joinTime;
        /**
         * 参会者离开会议时间戳（单位秒）。
         */
        @Expose
        @SerializedName("left_time")
        private String leftTime;
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
         */
        @Expose
        @SerializedName("instanceid")
        private Integer instanceId;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getJoinTime() {
            return joinTime;
        }

        public void setJoinTime(String joinTime) {
            this.joinTime = joinTime;
        }

        public String getLeftTime() {
            return leftTime;
        }

        public void setLeftTime(String leftTime) {
            this.leftTime = leftTime;
        }

        public Integer getInstanceId() {
            return instanceId;
        }

        public void setInstanceId(Integer instanceId) {
            this.instanceId = instanceId;
        }
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

    public String getScheduleStartTime() {
        return scheduleStartTime;
    }

    public void setScheduleStartTime(String scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
    }

    public String getScheduleEndTime() {
        return scheduleEndTime;
    }

    public void setScheduleEndTime(String scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public Boolean getHasRemaining() {
        return hasRemaining;
    }

    public void setHasRemaining(Boolean hasRemaining) {
        this.hasRemaining = hasRemaining;
    }

    public Integer getNextPos() {
        return nextPos;
    }

    public void setNextPos(Integer nextPos) {
        this.nextPos = nextPos;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
