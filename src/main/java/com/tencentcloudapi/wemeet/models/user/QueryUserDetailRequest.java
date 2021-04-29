package com.tencentcloudapi.wemeet.models.user;

import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;
import com.tencentcloudapi.wemeet.models.AbstractModel;

/**
 * <p>获取用户详情请求</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class QueryUserDetailRequest extends AbstractModel {
    private String userId;

    @Override
    public String getPath() {
        return "/v1/users/" + this.userId;
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
}
