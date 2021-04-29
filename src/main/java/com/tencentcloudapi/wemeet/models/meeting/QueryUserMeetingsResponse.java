package com.tencentcloudapi.wemeet.models.meeting;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tencentcloudapi.wemeet.models.BaseResponse;

import java.io.Serializable;
import java.util.List;

/**
 * <p>查询用户的会议列表返回</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class QueryUserMeetingsResponse extends BaseResponse implements Serializable {
    /**
     * 会议数量
     */
    @Expose
    @SerializedName("meeting_number")
    private Integer meetingNumber;
    /**
     * 会议列表
     */
    @Expose
    @SerializedName("meeting_info_list")
    private List<MeetingInfo> meetingInfoList;
    /**
     * 下次查询时请求里需要携带的 pos 参数
     */
    @Expose
    @SerializedName("next_pos")
    private Integer nextPos;
    /**
     * 未返回的会议数量；因目前一次查询返回会议数量最多为20，如果会议总数量超过20则此字段被置为非0，表示需要再次查询，
     * 且下次查询的“pos”参数需从本次响应的“next_pos”字段取值
     */
    @Expose
    @SerializedName("remaining")
    private Integer remaining;

    public Integer getMeetingNumber() {
        return meetingNumber;
    }

    public void setMeetingNumber(Integer meetingNumber) {
        this.meetingNumber = meetingNumber;
    }

    public List<MeetingInfo> getMeetingInfoList() {
        return meetingInfoList;
    }

    public void setMeetingInfoList(List<MeetingInfo> meetingInfoList) {
        this.meetingInfoList = meetingInfoList;
    }

    public Integer getNextPos() {
        return nextPos;
    }

    public void setNextPos(Integer nextPos) {
        this.nextPos = nextPos;
    }

    public Integer getRemaining() {
        return remaining;
    }

    public void setRemaining(Integer remaining) {
        this.remaining = remaining;
    }
}
