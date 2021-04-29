package com.tencentcloudapi.wemeet.models.meeting;

import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;
import com.tencentcloudapi.wemeet.models.AbstractModel;

/**
 * <p>查询用户的会议列表请求参数</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class QueryUserMeetingsRequest extends AbstractModel {
    private String userId;
    private Integer instanceId;
    private Integer pos;
    private String isShowAllSubMeetings;

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
        this.addParams("instanceid", Integer.toString(instanceId));
        this.instanceId = instanceId;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.addParams("pos", Integer.toString(pos));
        this.pos = pos;
    }

    public String getIsShowAllSubMeetings() {
        return isShowAllSubMeetings;
    }

    public void setIsShowAllSubMeetings(String isShowAllSubMeetings) {
        this.addParams("is_show_all_sub_meetings", isShowAllSubMeetings);
        this.isShowAllSubMeetings = isShowAllSubMeetings;
    }
}
