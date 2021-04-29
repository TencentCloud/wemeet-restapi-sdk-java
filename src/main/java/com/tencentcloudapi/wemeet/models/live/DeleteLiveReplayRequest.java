package com.tencentcloudapi.wemeet.models.live;

import com.squareup.okhttp.MediaType;
import com.tencentcloudapi.wemeet.common.constants.HttpMethodEnum;
import com.tencentcloudapi.wemeet.models.AbstractModel;

/**
 * <p>删除直播回看请求参数</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class DeleteLiveReplayRequest extends AbstractModel {
    /**
     * 会议id
     */
    private String meetingId;
    /**
     * 直播房间id
     */
    private String liveRoomId;
    /**
     * 用户id
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
     */
    private Integer instanceId;

    @Override
    public String getPath() {
        return "/v1/meetings/" + this.meetingId + "/live_play/" + this.liveRoomId + "/replays";
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
        return HttpMethodEnum.DELETE;
    }

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public String getLiveRoomId() {
        return liveRoomId;
    }

    public void setLiveRoomId(String liveRoomId) {
        this.liveRoomId = liveRoomId;
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
}
