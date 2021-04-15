package com.tencentcloudapi.wemeet.common.constants;

/**
 * <p>用户的终端设备类型</p>
 *
 * @author tencent
 * @date 2021/4/6
 */
public enum InstanceEnum {
    /**
     * PC
     */
    INSTANCE_PC(1),
    /**
     * Mac
     */
    INSTANCE_MAC(2),
    /**
     * Android
     */
    INSTANCE_ANDROID(3),
    /**
     * iOS
     */
    INSTANCE_IOS(4),
    /**
     * Web
     */
    INSTANCE_WEB(5),
    /**
     * iPad
     */
    INSTANCE_IPAD(6),
    /**
     * Android Pad
     */
    INSTANCE_ANDROID_PAD(7),
    /**
     * 小程序
     */
    INSTANCE_MINI_APP(8);

    InstanceEnum(int instanceID) {
        this.instanceID = instanceID;
    }

    private final int instanceID;

    public int getInstanceID() {
        return instanceID;
    }
}
