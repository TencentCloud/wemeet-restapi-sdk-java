package com.tencentcloudapi.wemeet.models.recording;

import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;
import com.tencentcloudapi.wemeet.models.AbstractModel;

/**
 * <p>删除会议录制文件请求参数</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class DeleteMeetingRecordsRequest extends AbstractModel {
    private String meetingId;
    private String meetingRecordId;
    private String userId;

    @Override
    public String getPath() {
        return "/v1/records";
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
        return HttpMethodEnum.DELETE;
    }

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.addParams("meeting_id", meetingId);
        this.meetingId = meetingId;
    }

    public String getMeetingRecordId() {
        return meetingRecordId;
    }

    public void setMeetingRecordId(String meetingRecordId) {
        this.addParams("meeting_record_id", meetingRecordId);
        this.meetingRecordId = meetingRecordId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.addParams("userid", userId);
        this.userId = userId;
    }
}
