package com.tencentcloudapi.wemeet.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * <p>直播配置对象</p>
 *
 * @author tencent
 * @date 2021/4/26
 */
public class LiveConfig {
    /**
     * 直播主题，开启之后
     */
    @Expose
    @SerializedName("live_subject")
    private String liveSubject;
    /**
     * 直播简介
     */
    @Expose
    @SerializedName("live_summary")
    private String liveSummary;
    /**
     * 是否开启直播密码，默认值为 false。
     * true：开启
     * false：不开启
     */
    @Expose
    @SerializedName("enable_live_password")
    private Boolean enableLivePassword;
    /**
     * 直播密码。当设置开启直播密码时，该参数必填。
     */
    @Expose
    @SerializedName("live_password")
    private String livePassword;
    /**
     * 允许观众讨论，默认值为 false。
     * true：开启
     * false：不开启
     */
    @Expose
    @SerializedName("enable_live_im")
    private Boolean enableLiveIm;
    /**
     * 开启直播回看，默认值为 false。
     * true：开启
     * false：不开启
     */
    @Expose
    @SerializedName("enable_live_replay")
    private Boolean enableLiveReplay;
    /**
     * 直播观看地址
     */
    @Expose
    @SerializedName("live_addr")
    private String liveAddr;
    /**
     * 直播水印对象信息
     */
    @Expose
    @SerializedName("live_watermark")
    private LiveWatermark liveWatermark;

    /**
     * 直播水印信息
     */
    public static class LiveWatermark {
        /**
         * 水印选项，默认为0。
         * 0：默认水印
         * 1：无水印
         */
        @Expose
        @SerializedName("watermark_opt")
        private Integer watermarkOpt;

        public Integer getWatermarkOpt() {
            return watermarkOpt;
        }

        public void setWatermarkOpt(Integer watermarkOpt) {
            this.watermarkOpt = watermarkOpt;
        }
    }

    public String getLiveSubject() {
        return liveSubject;
    }

    public void setLiveSubject(String liveSubject) {
        this.liveSubject = liveSubject;
    }

    public String getLiveSummary() {
        return liveSummary;
    }

    public void setLiveSummary(String liveSummary) {
        this.liveSummary = liveSummary;
    }

    public Boolean getEnableLivePassword() {
        return enableLivePassword;
    }

    public void setEnableLivePassword(Boolean enableLivePassword) {
        this.enableLivePassword = enableLivePassword;
    }

    public String getLivePassword() {
        return livePassword;
    }

    public void setLivePassword(String livePassword) {
        this.livePassword = livePassword;
    }

    public Boolean getEnableLiveIm() {
        return enableLiveIm;
    }

    public void setEnableLiveIm(Boolean enableLiveIm) {
        this.enableLiveIm = enableLiveIm;
    }

    public Boolean getEnableLiveReplay() {
        return enableLiveReplay;
    }

    public void setEnableLiveReplay(Boolean enableLiveReplay) {
        this.enableLiveReplay = enableLiveReplay;
    }

    public String getLiveAddr() {
        return liveAddr;
    }

    public void setLiveAddr(String liveAddr) {
        this.liveAddr = liveAddr;
    }

    public LiveWatermark getLiveWatermark() {
        return liveWatermark;
    }

    public void setLiveWatermark(LiveWatermark liveWatermark) {
        this.liveWatermark = liveWatermark;
    }
}
