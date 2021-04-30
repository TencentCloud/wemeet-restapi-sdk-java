package com.tencentcloudapi.wemeet.models.corp;

import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;
import com.tencentcloudapi.wemeet.models.AbstractModel;

/**
 * <p>获取账户级实时会议列表请求参数</p>
 *
 * @author tencent
 * @date 2021/4/29
 */
public class QueryCorpOnlineMeetingsRequest extends AbstractModel {
    /**
     * 分页大小。
     */
    private Integer pageSize;
    /**
     * 当前页。
     */
    private Integer page;
    /**
     * 会议号。
     */
    private String meetingCode;
    /**
     * 会议状态：
     * 1：结束会议
     * 2：实时会议
     * 3：即将开始的会议
     */
    private Integer meetingState;

    /**
     * 用户id
     */
    private String userId;
    /**
     * 搜索开始时间，针对媒体房间的开始时间
     */
    private Integer startTime;
    /**
     * 搜索结束时间，针对媒体房间的开始时间
     */
    private Integer endTime;

    @Override
    public String getPath() {
        return "/v1/corp/meetings";
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

    public String getMeetingCode() {
        return meetingCode;
    }

    public void setMeetingCode(String meetingCode) {
        this.addParams("meeting_code", meetingCode);
        this.meetingCode = meetingCode;
    }

    public Integer getMeetingState() {
        return meetingState;
    }

    public void setMeetingState(Integer meetingState) {
        this.addParams("meeting_state", Integer.toString(meetingState));
        this.meetingState = meetingState;
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
