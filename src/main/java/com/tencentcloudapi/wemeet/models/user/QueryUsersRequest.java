package com.tencentcloudapi.wemeet.models.user;

import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;
import com.tencentcloudapi.wemeet.models.AbstractModel;

/**
 * <p>查询用户列表请求参数</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class QueryUsersRequest extends AbstractModel {
    /**
     * 当前页，大于等于1，默认为1
     */
    private Integer page;
    /**
     * 分页大小，默认为20，最大为20
     */
    private Integer pageSize;

    @Override
    public String getPath() {
        return "/v1/users/list";
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

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.addParams("page", Integer.toString(page));
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.addParams("page_size", Integer.toString(pageSize));
        this.pageSize = pageSize;
    }
}
