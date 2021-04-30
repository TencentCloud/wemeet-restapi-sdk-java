package com.tencentcloudapi.wemeet.models.corp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tencentcloudapi.wemeet.models.BaseResponse;

import java.util.List;

/**
 * <p>获取账户级即将开始的会议列表返回参数</p>
 *
 * @author tencent
 * @date 2021/4/29
 */
public class QueryCorpPreStartMeetingsResponse extends BaseResponse {
    @Expose
    @SerializedName("total_count")
    private Integer totalCount;
    @Expose
    @SerializedName("current_size")
    private Integer currentSize;
    @Expose
    @SerializedName("current_page")
    private Integer currentPage;
    @Expose
    @SerializedName("total_page")
    private Integer totalPage;
    @Expose
    @SerializedName("meeting_info_list")
    private List<CorpPreStartMeeting> meetingInfoList;

    public static class CorpPreStartMeeting extends CorpMeetingInfo {
        /**
         * 在线人数
         */
        @Expose
        @SerializedName("online_member_num")
        private Integer onlineMemberNum;
        /**
         * 会议状态：
         * 1：结束会议
         * 2：实时会议
         * 3：即将开始的会议
         */
        @Expose
        @SerializedName("meeting_state")
        private Integer meetingState;
        /**
         * 会议类型
         */
        @Expose
        @SerializedName("meeting_type")
        private Integer meetingType;

        public Integer getOnlineMemberNum() {
            return onlineMemberNum;
        }

        public void setOnlineMemberNum(Integer onlineMemberNum) {
            this.onlineMemberNum = onlineMemberNum;
        }

        public Integer getMeetingState() {
            return meetingState;
        }

        public void setMeetingState(Integer meetingState) {
            this.meetingState = meetingState;
        }

        public Integer getMeetingType() {
            return meetingType;
        }

        public void setMeetingType(Integer meetingType) {
            this.meetingType = meetingType;
        }
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(Integer currentSize) {
        this.currentSize = currentSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<CorpPreStartMeeting> getMeetingInfoList() {
        return meetingInfoList;
    }

    public void setMeetingInfoList(List<CorpPreStartMeeting> meetingInfoList) {
        this.meetingInfoList = meetingInfoList;
    }
}
