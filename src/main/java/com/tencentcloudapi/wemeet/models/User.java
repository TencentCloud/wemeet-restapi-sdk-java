package com.tencentcloudapi.wemeet.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * <p>UserObj数组对象</p>
 *
 * @author tencent
 * @date 2021/4/26
 */
public class User {
    /**
     * 用户 ID（企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId）
     */
    @Expose
    @SerializedName("userid")
    private String userId;
    /**
     * 用户是否匿名入会，缺省为 false，不匿名。
     * true：匿名
     * false：不匿名
     */
    @Expose
    @SerializedName("is_anonymous")
    private Boolean anonymous;
    /**
     * 用户匿名字符串。如果字段“is_anonymous”设置为“true”，但是无指定匿名字符串, 会议将分配缺省名称，
     * 例如 “会议用户xxxx”，其中“xxxx”为随机数字。
     */
    @Expose
    @SerializedName("nick_name")
    private String nickName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Boolean getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(Boolean anonymous) {
        this.anonymous = anonymous;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
