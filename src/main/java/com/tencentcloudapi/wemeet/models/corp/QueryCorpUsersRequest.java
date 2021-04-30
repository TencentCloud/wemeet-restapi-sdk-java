package com.tencentcloudapi.wemeet.models.corp;

import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;
import com.tencentcloudapi.wemeet.models.AbstractModel;

/**
 * <p>获取账户级全量用户列表请求参数</p>
 *
 * @author tencent
 * @date 2021/4/29
 */
public class QueryCorpUsersRequest extends AbstractModel {
    /**
     * 分页大小。
     */
    private Integer pageSize;
    /**
     * 当前页。
     */
    private Integer page;
    /**
     * 用户名称
     */
    private String username;
    /**
     * 用户 userid
     */
    private String userId;
    /**
     * 账号状态：
     * 0：禁用
     * 1：启用
     * 2：未激活
     */
    private Integer status;
    /**
     * 角色类型
     */
    private String roleCode;


    @Override
    public String getPath() {
        return "/v1/corp/users";
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.addParams("username", username);
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.addParams("userid", userId);
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.addParams("status", Integer.toString(status));
        this.status = status;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.addParams("role_code", roleCode);
        this.roleCode = roleCode;
    }
}
