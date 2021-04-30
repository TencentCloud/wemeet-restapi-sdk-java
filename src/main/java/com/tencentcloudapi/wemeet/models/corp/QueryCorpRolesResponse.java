package com.tencentcloudapi.wemeet.models.corp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tencentcloudapi.wemeet.models.BaseResponse;

import java.util.List;

/**
 * <p>获取账户级角色列表返回</p>
 *
 * @author tencent
 * @date 2021/4/29
 */
public class QueryCorpRolesResponse extends BaseResponse {
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
    /**
     * 角色对象列表
     */
    @Expose
    @SerializedName("user_role_list")
    private List<CorpRole> roleList;

    public static class CorpRole {
        /**
         * 角色 code
         */
        @Expose
        @SerializedName("role_code")
        private String roleCode;
        /**
         * 角色 name
         */
        @Expose
        @SerializedName("role_name")
        private String roleName;
        /**
         * 角色描述
         */
        @Expose
        @SerializedName("role_desc")
        private String roleDesc;
        /**
         * 具备该角色的用户数
         */
        @Expose
        @SerializedName("role_member_nu")
        private String roleMemberNum;

        public String getRoleCode() {
            return roleCode;
        }

        public void setRoleCode(String roleCode) {
            this.roleCode = roleCode;
        }

        public String getRoleName() {
            return roleName;
        }

        public void setRoleName(String roleName) {
            this.roleName = roleName;
        }

        public String getRoleDesc() {
            return roleDesc;
        }

        public void setRoleDesc(String roleDesc) {
            this.roleDesc = roleDesc;
        }

        public String getRoleMemberNum() {
            return roleMemberNum;
        }

        public void setRoleMemberNum(String roleMemberNum) {
            this.roleMemberNum = roleMemberNum;
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

    public List<CorpRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<CorpRole> roleList) {
        this.roleList = roleList;
    }
}
