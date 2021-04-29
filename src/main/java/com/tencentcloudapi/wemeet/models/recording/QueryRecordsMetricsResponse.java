package com.tencentcloudapi.wemeet.models.recording;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tencentcloudapi.wemeet.models.BaseResponse;

import java.util.List;

/**
 * <p>查询录制文件访问数据返回参数</p>
 *
 * @author tencent
 * @date 2021/4/28
 */
public class QueryRecordsMetricsResponse extends BaseResponse {
    /**
     * 概览数据集合
     */
    private List<Summary> summaries;

    public static class Summary {
        /**
         * 统计时间，格式：yyyy-MM-dd。
         */
        @Expose
        @SerializedName("date")
        private String date;
        /**
         * 观看次数（当天数据），默认0
         */
        @Expose
        @SerializedName("view_counts")
        private Integer viewCounts;
        /**
         * 下载次数（当天数据），默认0
         */
        @Expose
        @SerializedName("download_counts")
        private Integer downloadCounts;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public Integer getViewCounts() {
            return viewCounts;
        }

        public void setViewCounts(Integer viewCounts) {
            this.viewCounts = viewCounts;
        }

        public Integer getDownloadCounts() {
            return downloadCounts;
        }

        public void setDownloadCounts(Integer downloadCounts) {
            this.downloadCounts = downloadCounts;
        }
    }

    public List<Summary> getSummaries() {
        return summaries;
    }

    public void setSummaries(List<Summary> summaries) {
        this.summaries = summaries;
    }
}
