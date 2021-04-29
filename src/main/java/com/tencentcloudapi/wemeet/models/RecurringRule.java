package com.tencentcloudapi.wemeet.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * <p>周期性会议配置</p>
 *
 * @author tencent
 * @date 2021/4/26
 */
public class RecurringRule {
    /**
     * 重复类型，默认值为0。
     * 0：每天
     * 1：每个工作日
     * 2：每周
     * 3：每两周
     * 4：每月
     */
    @Expose
    @SerializedName("recurring_type")
    private Integer recurringType;
    /**
     * 结束重复类型，默认值为0。
     * 0：按日期结束重复
     * 1：按次数结束重复
     */
    @Expose
    @SerializedName("until_type")
    private Integer untilType;
    /**
     * 结束日期时间戳，默认值为当前日期 + 7天。
     * 最大支持预定50场子会议。
     */
    @Expose
    @SerializedName("until_date")
    private Integer untilDate;
    /**
     * 限定会议次数（1-50次），默认值为7次。
     */
    @Expose
    @SerializedName("until_count")
    private Integer untilCount;

    public Integer getRecurringType() {
        return recurringType;
    }

    public void setRecurringType(Integer recurringType) {
        this.recurringType = recurringType;
    }

    public Integer getUntilType() {
        return untilType;
    }

    public void setUntilType(Integer untilType) {
        this.untilType = untilType;
    }

    public Integer getUntilDate() {
        return untilDate;
    }

    public void setUntilDate(Integer untilDate) {
        this.untilDate = untilDate;
    }

    public Integer getUntilCount() {
        return untilCount;
    }

    public void setUntilCount(Integer untilCount) {
        this.untilCount = untilCount;
    }
}
