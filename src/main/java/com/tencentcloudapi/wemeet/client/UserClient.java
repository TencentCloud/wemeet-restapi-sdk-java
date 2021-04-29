package com.tencentcloudapi.wemeet.client;

import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.wemeet.common.RequestSender;
import com.tencentcloudapi.wemeet.common.exception.WemeetSdkException;
import com.tencentcloudapi.wemeet.models.BaseResponse;
import com.tencentcloudapi.wemeet.models.user.*;

/**
 * <p>用户管理</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class UserClient {
    private final RequestSender sender;

    public UserClient(RequestSender sender) {
        this.sender = sender;
    }

    /**
     * 创建用户
     */
    public BaseResponse createUser(CreateUserRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<BaseResponse>() {
        });
    }

    /**
     * 更新用户
     */
    public BaseResponse modifyUser(ModifyUserRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<BaseResponse>() {
        });
    }

    /**
     * 获取用户详情
     */
    public QueryUserDetailResponse queryUserDetail(QueryUserDetailRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<QueryUserDetailResponse>() {
        });
    }

    /**
     * 获取用户列表
     */
    public QueryUsersResponse queryUsers(QueryUsersRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<QueryUsersResponse>() {
        });
    }

    /**
     * 删除用户
     */
    public BaseResponse deleteUser(DeleteUserRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<BaseResponse>() {
        });
    }
}
