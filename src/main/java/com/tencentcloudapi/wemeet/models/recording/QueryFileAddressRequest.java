package com.tencentcloudapi.wemeet.models.recording;

import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;
import com.tencentcloudapi.wemeet.models.AbstractModel;

/**
 * <p>查询单个录制文件地址请求参数</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class QueryFileAddressRequest extends AbstractModel {
    /**
     * 录制文件 ID，列表接口返回的 record_file_id。
     */
    private String recordFileId;
    /**
     * 用户 ID（企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId）。
     * 企业唯一用户标识说明：
     * 1. 企业对接 SSO 时使用的员工唯一标识 ID；
     * 2. 企业调用创建用户接口时传递的 userid 参数
     */
    private String userId;

    @Override
    public String getPath() {
        return "/v1/addresses/" + recordFileId;
    }

    @Override
    public String getBody() {
        return null;
    }

    @Override
    public MediaType contentType() {
        return null;
    }

    @Override
    public HttpMethodEnum getMethod() {
        return HttpMethodEnum.GET;
    }

    public String getRecordFileId() {
        return recordFileId;
    }

    public void setRecordFileId(String recordFileId) {
        this.addParams("record_file_id", recordFileId);
        this.recordFileId = recordFileId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.addParams("userid", userId);
        this.userId = userId;
    }
}
