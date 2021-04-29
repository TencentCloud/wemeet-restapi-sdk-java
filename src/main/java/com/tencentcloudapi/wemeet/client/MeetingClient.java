package com.tencentcloudapi.wemeet.client;

import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.wemeet.common.RequestSender;
import com.tencentcloudapi.wemeet.common.exception.WemeetSdkException;
import com.tencentcloudapi.wemeet.models.BaseResponse;
import com.tencentcloudapi.wemeet.models.meeting.*;

/**
 * <p>会议管理</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class MeetingClient {
    private final RequestSender sender;

    public MeetingClient(RequestSender sender) {
        this.sender = sender;
    }

    /**
     * 创建会议
     */
    public QueryMeetingDetailResponse createMeeting(CreateMeetingRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<QueryMeetingDetailResponse>() {
        });
    }

    /**
     * 通过会议ID查询会议
     */
    public QueryMeetingDetailResponse queryMeetingById(QueryMeetingByIdRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<QueryMeetingDetailResponse>() {
        });
    }

    /**
     * 通过会议CODE查询会议
     */
    public QueryMeetingDetailResponse queryMeetingByCode(QueryMeetingByCodeRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<QueryMeetingDetailResponse>() {
        });
    }

    /**
     * 取消会议
     */
    public BaseResponse cancelMeeting(CancelMeetingRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<BaseResponse>() {
        });
    }

    /**
     * 结束会议
     */
    public BaseResponse dismissMeeting(DismissMeetingRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<BaseResponse>() {
        });
    }

    /**
     * 修改会议
     */
    public QueryMeetingDetailResponse modifyMeeting(ModifyMeetingRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<QueryMeetingDetailResponse>() {
        });
    }

    /**
     * 查询参会成员列表
     */
    public QueryParticipantsResponse queryParticipants(QueryParticipantsRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<QueryParticipantsResponse>() {
        });
    }

    /**
     * 查询用户的会议列表
     */
    public QueryUserMeetingsResponse queryUserMeetings(QueryUserMeetingsRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<QueryUserMeetingsResponse>() {
        });
    }

    /**
     * 查询用户的已结束会议列表
     */
    public QueryEndedMeetingsResponse queryEndedMeetings(QueryEndedMeetingsRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<QueryEndedMeetingsResponse>() {
        });
    }

}
