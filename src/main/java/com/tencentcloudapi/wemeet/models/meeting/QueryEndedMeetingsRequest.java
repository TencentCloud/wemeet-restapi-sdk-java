package com.tencentcloudapi.wemeet.models.meeting;

import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;
import com.tencentcloudapi.wemeet.models.AbstractModel;

/**
 * <p>查询已结束会议列表请求参数</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class QueryEndedMeetingsRequest extends AbstractModel {
    /**
     * 用户的 ID（企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId） 必传
     */
    private String userId;
    /**
     * 分页大小，默认20条，最大20条 必传
     */
    private Integer pageSize;
    /**
     * 当前页，页码起始值为1，默认为1。 必传
     */
    private Integer page;
    /**
     * 会议号，会议号中不能包含有空格
     */
    private String meetingCode;
    /**
     * 查询起始时间戳，UNIX 时间戳（单位秒）。
     */
    private Integer startTime;
    /**
     * 查询结束时间戳，UNIX 时间戳（单位秒）。
     */
    private Integer endTime;


    @Override
    public String getPath() {
        return "/v1/history/meetings/" + this.userId;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
