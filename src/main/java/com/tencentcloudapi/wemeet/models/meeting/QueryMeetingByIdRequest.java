package com.tencentcloudapi.wemeet.models.meeting;

import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;
import com.tencentcloudapi.wemeet.models.AbstractModel;

/**
 * <p>根据会议ID查询请求参数</p>
 *
 * @author tencent
 * @date 2021/4/26
 */
public class QueryMeetingByIdRequest extends AbstractModel {
    /**
     * 会议ID 必传
     */
    private String meetingId;
    /**
     * 用户ID 必传
     */
    private String userId;
    /**
     * 用户终端设备ID 必传
     */
    private Integer instanceId;

    @Override
    public String getPath() {
        return "/v1/meetings/" + this.meetingId;
    }

    @Override
    public String getBody() {
        return null;
    }

    @Override
    public MediaType contentType() {
        return null;
    }

    @Override
    public HttpMethodEnum getMethod() {
        return HttpMethodEnum.GET;
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
        addParams("userid", userId);
    }

    public Integer getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Integer instanceId) {
        this.instanceId = instanceId;
        addParams("instanceid", instanceId.toString());
    }
}
