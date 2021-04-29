package com.tencentcloudapi.wemeet.models.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tencentcloudapi.wemeet.models.BaseResponse;

import java.util.List;

/**
 * <p>查询用户列表返回参数</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class QueryUsersResponse extends BaseResponse {
    @Expose
    @SerializedName("total_count")
    private Integer pageCount;
    @Expose
    @SerializedName("current_size")
    private Integer currentSize;
    @Expose
    @SerializedName("current_page")
    private Integer currentPage;
    @Expose
    @SerializedName("page_size")
    private Integer pageSize;
    @Expose
    @SerializedName("users")
    private List<UserDetail> users;

    public static class UserDetail {
        /**
         * 调用方用于标示用户的唯一 ID（例如企业用户可以为企业账户英文名、个人用户可以为手机号等）
         */
        @Expose
        @SerializedName("userid")
        private String userId;
        /**
         * 用户昵称
         */
        @Expose
        @SerializedName("username")
        private String username;
        /**
         * 地区编码（国内默认86）
         */
        @Expose
        @SerializedName("area")
        private String area;
        /**
         * 更新时间
         */
        @Expose
        @SerializedName("update_time")
        private String updateTime;
        /**
         * 用户图像地址
         */
        @Expose
        @SerializedName("avatar_url")
        private String avatarUrl;
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

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
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
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(Integer currentSize) {
        this.currentSize = currentSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<UserDetail> getUsers() {
        return users;
    }

    public void setUsers(List<UserDetail> users) {
        this.users = users;
    }
}
