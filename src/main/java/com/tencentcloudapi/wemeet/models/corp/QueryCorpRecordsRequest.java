package com.tencentcloudapi.wemeet.models.corp;

import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;
import com.tencentcloudapi.wemeet.models.AbstractModel;

/**
 * <p>查询账户级录制列表请求参数</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class QueryCorpRecordsRequest extends AbstractModel {
    /**
     * 分页大小，默认值为10，最大为20
     */
    private Integer pageSize;
    /**
     * 页码，从1开始，默认值为1
     */
    private Integer page;
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
        return "/v1/corp/records";
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
