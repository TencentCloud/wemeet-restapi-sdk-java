package com.tencentcloudapi.wemeet.models.live;

import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;
import com.tencentcloudapi.wemeet.models.AbstractModel;

/**
 * <p>通过会议code查询直播回看</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class QueryLiveReplayByCodeRequest extends AbstractModel {
    private String meetingCode;
    private String userId;
    private Integer instanceId;

    @Override
    public String getPath() {
        return "/v1/meetings/live_play/replays";
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

    public String getMeetingCode() {
        return meetingCode;
    }

    public void setMeetingCode(String meetingCode) {
        this.addParams("meeting_code", meetingCode);
        this.meetingCode = meetingCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.addParams("userid", userId);
        this.userId = userId;
    }

    public Integer getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Integer instanceId) {
        this.addParams("instanceid", Integer.toString(instanceId));
        this.instanceId = instanceId;
    }
}
