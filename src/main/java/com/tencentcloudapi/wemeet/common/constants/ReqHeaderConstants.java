package com.tencentcloudapi.wemeet.common.constants;

/**
 * <p>header key枚举值</p>
 *
 * @author tencent
 * @date 2021/4/27
 */
public interface ReqHeaderConstants {
    /**
     * 操作的接口名称。取值参考接口文档中输入参数公共参数 Action 的说明。例如云服务器的查询实例列表接口，取值为 DescribeInstances。
     */
    String ACTION = "X-TC-Action";
    /**
     * 地域参数，用来标识希望操作哪个地域的数据。接口接受的地域取值参考接口文档中输入参数公共参数 Region 的说明。
     * 注意：某些接口不需要传递该参数，接口文档中会对此特别说明，此时即使传递该参数也不会生效。
     */
    String REGION = "X-TC-Region";
    /**
     * 此参数参与签名计算。腾讯云 API 接入，申请的安全凭证密钥对中的 SecretId，其 Secretkey 用于签名。
     * 企业管理员可以登录 腾讯会议官网，单击右上角【用户中心】，在左侧菜单栏中的【企业管理】>【高级】>【restApi】中进行查看。
     */
    String KEY = "X-TC-Key";
    /**
     * 此参数参与签名计算。当前 UNIX 时间戳，可记录发起 API 请求的时间。例如1529223702，单位为秒。
     * 注意：如果与服务器时间相差超过5分钟，会引起签名过期错误
     */
    String TIMESTAMP = "X-TC-Timestamp";
    /**
     * 此参数参与签名计算。随机正整数。
     */
    String NONCE = "X-TC-Nonce";
    /**
     * 应用 App 的版本号，建议设置，以便灰度和查找问题
     */
    String VERSION = "X-TC-Version";
    /**
     * 放置由下面的签名方法产生的签名
     */
    String SIGNATURE = "X-TC-Signature";
    /**
     * 临时证书所用的 Token ，需要结合临时密钥一起使用。临时密钥和 Token 需要到访问管理服务调用接口获取。长期密钥不需要 Token
     */
    String TOKEN = "X-TC-Token";
    /**
     * 腾讯会议分配给三方开发应用的 App ID。企业管理员可以登录 腾讯会议官网，
     * 单击右上角【用户中心】，在左侧菜单栏中的【企业管理】>【高级】>【restApi】中进行查看。
     */
    String APP_ID = "AppId";
    /**
     * 用户子账号或开发的应用 ID，企业管理员可以登录 腾讯会议官网，单击右上角【用户中心】，
     * 在左侧菜单栏中的【企业管理】>【高级】>【restApi】中进行查看（如存在 SdkId 则必须填写，早期申请 API 且未分配 SdkId 的客户可不填写）
     */
    String SDK_ID = "SdkId";
    /**
     * 当未使用企业通讯录创建会议时，该字段为非必填字段，创建的会议将不出现在用户的会议列表中，可使用会议链接或会议号入会；
     * 当启用企业通讯录创建会议时，该字段为必填字段，传入值为1，可指定主持人、可邀请参会成员，创建的会议可出现在用户的会议列表中。
     * 启用企业通讯录说明：
     * 1. 通过 SSO 接入腾讯会议帐号体系；
     * 2. 通过调用接口创建企业用户；
     * 3. 通过企业管理后台添加或批量导入企业用户。
     */
    String REGISTERED = "X-TC-Registered";
    /**
     * OAuth2.0 鉴权成功后返回的 token 信息
     */
    String ACCESS_TOKEN = "AccessToken";
    /**
     * OAuth2.0 鉴权成功后的用户信息。
     */
    String OPEN_ID = "OpenId";
}
