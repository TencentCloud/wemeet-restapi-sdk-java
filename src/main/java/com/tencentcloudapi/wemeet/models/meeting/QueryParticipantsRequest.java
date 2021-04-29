package com.tencentcloudapi.wemeet.models.meeting;

import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;
import com.tencentcloudapi.wemeet.models.AbstractModel;

/**
 * <p>查询参会人员列表请求参数</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class QueryParticipantsRequest extends AbstractModel {
    private String meetingId;
    private String subMeetingId;
    private String userId;
    private Integer pos;
    private Integer size;
    private Integer startTime;
    private Integer endTime;

    @Override
    public String getPath() {
        return "/v1/meetings/" + meetingId + "/participants";
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

    public String getSubMeetingId() {
        return subMeetingId;
    }

    public void setSubMeetingId(String subMeetingId) {
        this.addParams("sub_meeting_id", subMeetingId);
        this.subMeetingId = subMeetingId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.addParams("userid", userId);
        this.userId = userId;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.addParams("pos", Integer.toString(pos));
        this.pos = pos;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.addParams("size", Integer.toString(size));
        this.size = size;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.addParams("start_time", Integer.toString(startTime));
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.addParams("end_time", Integer.toString(endTime));
        this.endTime = endTime;
    }
}
