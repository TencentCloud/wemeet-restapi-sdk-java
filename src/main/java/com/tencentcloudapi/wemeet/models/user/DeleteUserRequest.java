package com.tencentcloudapi.wemeet.models.user;

import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;
import com.tencentcloudapi.wemeet.models.AbstractModel;

/**
 * <p>删除用户请求参数</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class DeleteUserRequest extends AbstractModel {
    /**
     * 调用方用于标示用户的唯一 ID（例如企业用户可以为企业账户英文名、个人用户可以为手机号等）。
     */
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
        return HttpMethodEnum.DELETE;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
