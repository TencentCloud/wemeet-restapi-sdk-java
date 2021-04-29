package com.tencentcloudapi.wemeet.models.recording;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tencentcloudapi.wemeet.models.BaseResponse;

import java.util.List;

/**
 * <p>desc</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class QueryRecordsEventsResponse extends BaseResponse {
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
    @SerializedName("events")
    private List<Event> events;

    public static class Event {
        /**
         * 操作时间，UNIX 时间戳（单位毫秒）。
         */
        @Expose
        @SerializedName("operate_time")
        private Integer operateTime;
        /**
         * 查询事件类型：
         * 1：下载
         * 2：查看
         */
        @Expose
        @SerializedName("event_type")
        private Integer eventType;
        /**
         * 用户 ID
         */
        @Expose
        @SerializedName("userid")
        private String userId;
        /**
         * 用户名称
         */
        @Expose
        @SerializedName("user_name")
        private String username;
        /**
         * 录制文件名称。
         */
        @Expose
        @SerializedName("record_name")
        private String recordName;

        public Integer getOperateTime() {
            return operateTime;
        }

        public void setOperateTime(Integer operateTime) {
            this.operateTime = operateTime;
        }

        public Integer getEventType() {
            return eventType;
        }

        public void setEventType(Integer eventType) {
            this.eventType = eventType;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getRecordName() {
            return recordName;
        }

        public void setRecordName(String recordName) {
            this.recordName = recordName;
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

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
