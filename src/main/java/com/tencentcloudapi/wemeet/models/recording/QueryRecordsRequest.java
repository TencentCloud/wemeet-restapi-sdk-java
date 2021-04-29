package com.tencentcloudapi.wemeet.models.recording;

import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;
import com.tencentcloudapi.wemeet.models.AbstractModel;

/**
 * <p>查询会议录制列表</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class QueryRecordsRequest extends AbstractModel {
    /**
     * 分页大小，默认值为10，最大为20
     */
    private Integer pageSize;
    /**
     * 页码，从1开始，默认值为1
     */
    private Integer page;
    /**
     * 用户 ID，当会议 ID 和会议 code 均为空时，表示查询用户所有会议的录制列表
     * （企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId）。
     * 企业唯一用户标识说明：
     * 1. 企业对接 SSO 时使用的员工唯一标识 ID；
     * 2. 企业调用创建用户接口时传递的 userid 参数
     */
    private String userId;
    /**
     * 会议 ID，不为空时优先根据会议 ID 查询
     */
    private String meetingId;
    /**
     * 会议 code，当 meeting_id 为空且 meeting_code 不为空时根据会议 code 查询
     */
    private String meetingCode;
    /**
     * 查询起始时间戳，UNIX 时间戳（单位秒）。说明：时间区间不允许超过31天
     */
    private Integer startTime;
    /**
     * 查询结束时间戳，UNIX 时间戳（单位秒）。说明：时间区间不允许超过31天
     */
    private Integer endTime;

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
        return HttpMethodEnum.GET;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.addParams("page_size", Integer.toString(pageSize));
        this.pageSize = pageSize;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.addParams("page", Integer.toString(page));
        this.page = page;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.addParams("userid", userId);
        this.userId = userId;
    }

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.addParams("meeting_id", meetingId);
        this.meetingId = meetingId;
    }

    public String getMeetingCode() {
        return meetingCode;
    }

    public void setMeetingCode(String meetingCode) {
        this.addParams("meeting_code", meetingCode);
        this.meetingCode = meetingCode;
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
