package com.tencentcloudapi.wemeet.models.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;
import com.tencentcloudapi.wemeet.models.AbstractModel;

/**
 * <p>创建用户请求参数</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class CreateUserRequest extends AbstractModel {
    /**
     * 邮箱地址
     */
    @Expose
    @SerializedName("email")
    private String email;
    /**
     * 手机号码（当前仅支持中国大陆号码） 必传
     */
    @Expose
    @SerializedName("phone")
    private String phone;
    /**
     * 用户昵称 必传
     */
    @Expose
    @SerializedName("username")
    private String username;
    /**
     * 调用方用于标示用户的唯一 ID（例如：企业用户可以为企业账户英文名、个人用户可以为手机号等，暂不支持中文）。必传
     */
    @Expose
    @SerializedName("userid")
    private String userId;


    @Override
    public String getPath() {
        return "/v1/users";
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
        return HttpMethodEnum.POST;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
