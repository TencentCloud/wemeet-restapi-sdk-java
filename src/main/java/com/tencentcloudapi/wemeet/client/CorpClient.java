package com.tencentcloudapi.wemeet.client;

import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.wemeet.common.RequestSender;
import com.tencentcloudapi.wemeet.common.exception.WemeetSdkException;
import com.tencentcloudapi.wemeet.models.corp.QueryCorpRecordsRequest;
import com.tencentcloudapi.wemeet.models.corp.QueryCorpRecordsResponse;

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
     * 获取账户级会议录制列表
     */
    public QueryCorpRecordsResponse queryRecords(QueryCorpRecordsRequest request) throws WemeetSdkException {
        return sender.request(request, new TypeToken<QueryCorpRecordsResponse>() {
        });
    }
}
