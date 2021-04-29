package com.tencentcloudapi.wemeet.client;

import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.wemeet.common.RequestSender;
import com.tencentcloudapi.wemeet.common.exception.WemeetSdkException;
import com.tencentcloudapi.wemeet.models.BaseResponse;
import com.tencentcloudapi.wemeet.models.recording.*;

/**
 * <p>直播管理</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class RecordingClient {
    private final RequestSender sender;

    public RecordingClient(RequestSender sender) {
        this.sender = sender;
    }

    /**
     * 查询会议录制列表
     */
    public QueryRecordsResponse queryRecords(QueryRecordsRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<QueryRecordsResponse>() {
        });
    }

    /**
     * 查询会议录制地址
     */
    public QueryMeetingAddressResponse queryMeetingRecordsAddress(QueryMeetingAddressRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<QueryMeetingAddressResponse>() {
        });
    }

    /**
     * 查询单个录制地址
     */
    public QueryFileAddressResponse queryRecordFileAddress(QueryFileAddressRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<QueryFileAddressResponse>() {
        });
    }

    /**
     * 删除会议录制文件
     */
    public BaseResponse deleteMeetingRecords(DeleteMeetingRecordsRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<BaseResponse>() {
        });
    }

    /**
     * 删除单个录制文件
     */
    public BaseResponse deleteRecordFile(DeleteRecordFileRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<BaseResponse>() {
        });
    }

    /**
     * 修改会议录制共享设置
     */
    public BaseResponse modifyRecordsSetting(ModifyRecordsSettingRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<BaseResponse>() {
        });
    }

    /**
     * 查询录制文件访问数据
     */
    public QueryRecordsMetricsResponse queryRecordsMetrics(QueryRecordsMetricsRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<QueryRecordsMetricsResponse>() {
        });
    }

    /**
     * 查询会议录制操作明细
     */
    public QueryRecordsEventsResponse queryRecordsEvents(QueryRecordsEventsRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<QueryRecordsEventsResponse>() {
        });
    }

}
