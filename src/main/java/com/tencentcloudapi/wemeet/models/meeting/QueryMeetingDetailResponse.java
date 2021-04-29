package com.tencentcloudapi.wemeet.models.meeting;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tencentcloudapi.wemeet.models.BaseResponse;

import java.io.Serializable;
import java.util.List;

/**
 * <p>查询会议返回</p>
 *
 * @author tencent
 * @date 2021/4/6
 */
public class QueryMeetingDetailResponse extends BaseResponse implements Serializable {
    @SerializedName("meeting_number")
    @Expose
    private Integer meetingNumber;
    @SerializedName("meeting_info_list")
    @Expose
    private List<MeetingInfo> meetingInfoList;

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
}
