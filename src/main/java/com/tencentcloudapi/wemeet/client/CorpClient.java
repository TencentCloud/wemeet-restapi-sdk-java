package com.tencentcloudapi.wemeet.client;

import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.wemeet.common.RequestSender;
import com.tencentcloudapi.wemeet.common.exception.WemeetSdkException;
import com.tencentcloudapi.wemeet.models.corp.*;

/**
 * <p>仪表盘</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class CorpClient {
    private final RequestSender sender;

    public CorpClient(RequestSender sender) {
        this.sender = sender;
    }

    /**
     * 获取账户级已结束会议列表
     */
    public QueryCorpEndedMeetingsResponse queryEndedMeetings(QueryCorpEndedMeetingsRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<QueryCorpEndedMeetingsResponse>() {
        });
    }

    /**
     * 获取账户级即将开始的会议列表
     */
    public QueryCorpPreStartMeetingsResponse queryPreStartMeetings(QueryCorpPreStartMeetingsRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<QueryCorpPreStartMeetingsResponse>() {
        });
    }

    /**
     * 获取账户级实时会议列表
     */
    public QueryCorpOnlineMeetingsResponse queryOnlineMeetings(QueryCorpOnlineMeetingsRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<QueryCorpOnlineMeetingsResponse>() {
        });
    }

    /**
     * 获取账户级全量用户列表
     */
    public QueryCorpUsersResponse queryUsers(QueryCorpUsersRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<QueryCorpUsersResponse>() {
        });
    }

    /**
     * 获取账户级角色列表
     */
    public QueryCorpRolesResponse queryRoles(QueryCorpRolesRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<QueryCorpRolesResponse>() {
        });
    }

    /**
     * 获取账户级指定权限的用户列表
     */
    public QueryCorpUsersResponse queryUsersByRole(QueryCorpUsersByRoleRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<QueryCorpUsersResponse>() {
        });
    }

    /**
     * 获取账户级会议录制列表
     */
    public QueryCorpRecordsResponse queryRecords(QueryCorpRecordsRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<QueryCorpRecordsResponse>() {
        });
    }
}
