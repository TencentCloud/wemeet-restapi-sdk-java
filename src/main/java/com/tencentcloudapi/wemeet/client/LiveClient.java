package com.tencentcloudapi.wemeet.client;

import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.wemeet.common.RequestSender;
import com.tencentcloudapi.wemeet.common.exception.WemeetSdkException;
import com.tencentcloudapi.wemeet.models.BaseResponse;
import com.tencentcloudapi.wemeet.models.live.*;

/**
 * <p>直播管理</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class LiveClient {
    private final RequestSender sender;

    public LiveClient(RequestSender sender) {
        this.sender = sender;
    }

    /**
     * 通过会议ID修改直播配置
     */
    public BaseResponse modifyConfigByMeetingId(ModifyLiveByIdRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<BaseResponse>() {
        });
    }

    /**
     * 通过会议CODE修改直播配置
     */
    public BaseResponse modifyConfigByMeetingCode(ModifyLiveByCodeRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<BaseResponse>() {
        });
    }

    /**
     * 通过会议ID查询直播回看
     */
    public QueryLiveReplayResponse queryLiveReplaysByMeetingId(QueryLiveReplayByIdRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<QueryLiveReplayResponse>() {
        });
    }

    /**
     * 通过会议CODE查询直播回看
     */
    public QueryLiveReplayResponse queryLiveReplaysByMeetingCode(QueryLiveReplayByCodeRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<QueryLiveReplayResponse>() {
        });
    }

    /**
     * 删除直播回看文件
     */
    public BaseResponse deleteLiveReplay(DeleteLiveReplayRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<BaseResponse>() {
        });
    }

}
