package com.tencentcloudapi.wemeet.models.meeting;

import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;
import com.tencentcloudapi.wemeet.models.AbstractModel;

/**
 * <p>根据会议code查询请求参数</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class QueryMeetingByCodeRequest extends AbstractModel {
    /**
     * 有效的9位数字会议号码 必传
     */
    private String meetingCode;
    /**
     * 调用方用于标示用户的唯一 ID（企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId）。
     * 企业唯一用户标识说明：
     * 1. 企业对接 SSO 时使用的员工唯一标识 ID；
     * 2. 企业调用创建用户接口时传递的 userid 参数
     * 必传
     */
    private String userId;
    /**
     * 用户的终端设备类型：
     * 1：PC
     * 2：Mac
     * 3：Android
     * 4：iOS
     * 5：Web
     * 6：iPad
     * 7：Android Pad
     * 8：小程序
     * 必传
     */
    private Integer instanceId;

    @Override
    public String getPath() {
        return "/v1/meetings";
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

    public String getMeetingCode() {
        return meetingCode;
    }

    public void setMeetingCode(String meetingCode) {
        this.addParams("meeting_code", meetingCode);
        this.meetingCode = meetingCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.addParams("userid", userId);
        this.userId = userId;
    }

    public Integer getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Integer instanceId) {
        this.addParams("instanceid", String.valueOf(instanceId));
        this.instanceId = instanceId;
    }
}
