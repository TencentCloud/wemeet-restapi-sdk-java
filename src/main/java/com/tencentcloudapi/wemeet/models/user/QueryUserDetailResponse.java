package com.tencentcloudapi.wemeet.models.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tencentcloudapi.wemeet.models.BaseResponse;

/**
 * <p>用户明细</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class QueryUserDetailResponse extends BaseResponse {
    /**
     * 用户昵称
     */
    @Expose
    @SerializedName("username")
    private String username;
    /**
     * 更新时间
     */
    @Expose
    @SerializedName("update_time")
    private String updateTime;
    /**
     * 用户状态：
     * 1：正常
     * 2：删除
     */
    @Expose
    @SerializedName("status")
    private String status;
    /**
     * 邮箱地址
     */
    @Expose
    @SerializedName("email")
    private String email;
    /**
     * 手机号码
     */
    @Expose
    @SerializedName("phone")
    private String phone;
    /**
     * 调用方用于标示用户的唯一 ID（例如企业用户可以为企业账户英文名、个人用户可以为手机号等）
     */
    @Expose
    @SerializedName("userid")
    private String userId;
    /**
     * 地区编码（国内默认86）
     */
    @Expose
    @SerializedName("area")
    private String area;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
