package com.tencentcloudapi.wemeet.models.corp;

import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;
import com.tencentcloudapi.wemeet.models.AbstractModel;

/**
 * <p>获取账户级角色列表</p>
 *
 * @author tencent
 * @date 2021/4/29
 */
public class QueryCorpRolesRequest extends AbstractModel {
    /**
     * 分页大小。
     */
    private Integer pageSize;
    /**
     * 当前页。
     */
    private Integer page;

    @Override
    public String getPath() {
        return "/v1/corp/user-roles";
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
}
