package com.tencentcloudapi.wemeet.models.meeting;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * <p>修改会议请求参数</p>
 *
 * @author tencent
 * @date 2021/4/14
 */
public class UpdateMeetingRequest implements Serializable {
    @Expose
    @SerializedName("userid")
    private String userId;
    @Expose
    @SerializedName("instanceid")
    private Integer instanceId;
    @Expose
    private String subject;

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
