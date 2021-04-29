package com.tencentcloudapi.wemeet.models.recording;

import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;
import com.tencentcloudapi.wemeet.models.AbstractModel;

/**
 * <p>查询录制文件访问数据请求参数</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class QueryRecordsMetricsRequest extends AbstractModel {

    /**
     * 会议录制 ID。说明：查询会议录制列表返回的 meeting_record_id。
     */
    private String meetingRecordId;
    /**
     * 查询起始时间戳，UNIX 时间戳（单位秒）。说明：默认展示最近31天的数据，时间区间不允许超过31天
     */
    private Integer startTime;
    /**
     * 查询结束时间戳，UNIX 时间戳（单位秒）。说明：默认展示最近31天的数据，时间区间不允许超过31天
     */
    private Integer endTime;

    @Override
    public String getPath() {
        return "/v1/metrics/records";
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

    public String getMeetingRecordId() {
        return meetingRecordId;
    }

    public void setMeetingRecordId(String meetingRecordId) {
        this.addParams("meeting_record_id", meetingRecordId);
        this.meetingRecordId = meetingRecordId;
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
