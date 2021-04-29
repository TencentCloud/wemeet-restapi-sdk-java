package com.tencentcloudapi.wemeet.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * <p>会议嘉宾对象</p>
 *
 * @author tencent
 * @date 2021/4/26
 */
public class Guest {
    /**
     * 国家/地区代码（例如：中国传86，不是+86，也不是0086） 必传
     */
    @Expose
    @SerializedName("area")
    private String area;
    /**
     * 手机号 必传
     */
    @Expose
    @SerializedName("phone_number")
    private String phoneNumber;
    /**
     * 嘉宾名称
     */
    @Expose
    @SerializedName("guest_name")
    private String guestName;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }
}
