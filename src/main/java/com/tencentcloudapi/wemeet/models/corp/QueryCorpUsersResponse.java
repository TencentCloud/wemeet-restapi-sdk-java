package com.tencentcloudapi.wemeet.models.corp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tencentcloudapi.wemeet.models.BaseResponse;

import java.util.List;

/**
 * <p>获取账户级全量用户列表返回参数</p>
 *
 * @author tencent
 * @date 2021/4/29
 */
public class QueryCorpUsersResponse extends BaseResponse {
    @Expose
    @SerializedName("total_count")
    private Integer totalCount;
    @Expose
    @SerializedName("current_size")
    private Integer currentSize;
    @Expose
    @SerializedName("current_page")
    private Integer currentPage;
    @Expose
    @SerializedName("total_page")
    private Integer totalPage;
    @Expose
    @SerializedName("users")
    private List<CorpUser> users;

    public static class CorpUser {
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
         * 角色名称
         */
        @Expose
        @SerializedName("role_name")
        private String roleName;
        /**
         * 角色类型
         */
        @Expose
        @SerializedName("role_code")
        private String roleCode;
        /**
         * 手机号码
         */
        @Expose
        @SerializedName("phone")
        private String phone;
        /**
         * 邮箱地址
         */
        @Expose
        @SerializedName("email")
        private String email;
        /**
         * 用户状态：
         * 1：正常
         * 2：删除
         */
        @Expose
        @SerializedName("status")
        private String status;
        /**
         * 部门对象列表
         */
        @Expose
        @SerializedName("departments")
        private List<Department> departments;

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

        public String getRoleName() {
            return roleName;
        }

        public void setRoleName(String roleName) {
            this.roleName = roleName;
        }

        public String getRoleCode() {
            return roleCode;
        }

        public void setRoleCode(String roleCode) {
            this.roleCode = roleCode;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public List<Department> getDepartments() {
            return departments;
        }

        public void setDepartments(List<Department> departments) {
            this.departments = departments;
        }
    }

    public static class Department {
        /**
         * 部门 ID
         */
        @Expose
        @SerializedName("id")
        private String id;
        /**
         * 部门 name
         */
        @Expose
        @SerializedName("name")
        private String name;
        /**
         * 部门全称（包含全部上级部门名称，不包含公司名称）
         */
        @Expose
        @SerializedName("full_name")
        private String fullName;
        /**
         * 是否主部门：
         * true：是
         * false：否
         */
        @Expose
        @SerializedName("is_main")
        private Boolean main;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public Boolean getMain() {
            return main;
        }

        public void setMain(Boolean main) {
            this.main = main;
        }
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
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

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<CorpUser> getUsers() {
        return users;
    }

    public void setUsers(List<CorpUser> users) {
        this.users = users;
    }
}
