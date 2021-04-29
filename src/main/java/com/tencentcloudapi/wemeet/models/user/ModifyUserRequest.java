package com.tencentcloudapi.wemeet.models.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;
import com.tencentcloudapi.wemeet.models.AbstractModel;

/**
 * <p>更新用户请求参数</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class ModifyUserRequest extends AbstractModel {
    /**
     * 调用方用于标示用户的唯一 ID。
     * 企业唯一用户标识说明：企业调用创建用户接口时传递的 userid 参数
     * 必传
     */
    private String userId;
    /**
     * 新的邮箱地址
     */
    @Expose
    @SerializedName("email")
    private String email;
    /**
     * 新的用户昵称
     */
    @Expose
    @SerializedName("username")
    private String username;
    /**
     * 手机号码
     */
    @Expose
    @SerializedName("phone")
    private String phone;
    /**
     * 头像地址
     */
    @Expose
    @SerializedName("avatar_url")
    private String avatarUrl;

    @Override
    public String getPath() {
        return "/v1/users/" + this.userId;
    }

    @Override
    public String getBody() {
        return GSON.toJson(this);
    }

    @Override
    public MediaType contentType() {
        return MediaType.parse(MEDIA_TYPE_APPLICATION_JSON);
    }

    @Override
    public HttpMethodEnum getMethod() {
        return HttpMethodEnum.PUT;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
