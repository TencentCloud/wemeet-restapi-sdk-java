package com.tencentcloudapi.wemeet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Response;
import com.tencentcloudapi.wemeet.client.MeetingClient;
import com.tencentcloudapi.wemeet.client.UserClient;
import com.tencentcloudapi.wemeet.common.RequestSender;
import com.tencentcloudapi.wemeet.common.constants.InstanceEnum;
import com.tencentcloudapi.wemeet.common.exception.WemeetSdkException;
import com.tencentcloudapi.wemeet.common.profile.HttpProfile;
import com.tencentcloudapi.wemeet.models.meeting.CreateMeetingRequest;
import com.tencentcloudapi.wemeet.models.meeting.QueryMeetingDetailResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * <p>会议请求</p>
 * 企业内部应用鉴权方式
 * 1.企业管理员登录腾讯会议官网（https://meeting.tencent.com/），
 * 单击右上角【用户中心】，在左侧菜单栏中的【企业管理】>【高级】>【restApi】中进行查看。
 * 2.支持两种方式实例化请求代理对象
 * 1）全局代理对象：设置全局HttpProfile，在项目启动时进行初始化，并构造RequestSender对象，所有客户端请求可共用一套配置；
 * 2）局部代理对象：也可以针对具体某个接口单独实例化HttpProfile，并通过此对象构造RequestSender对象
 * 3.构造具体client，参考client包，例如MeetingClient，通过构造方法传入RequestSender实例，初始化client
 * 4.通过client调用具体方法即可发起请求，
 * eg：QueryMeetingDetailResponse response = client.createMeeting(request);
 * <p>
 * 第三方应用鉴权（OAuth2.0）
 * 1.参考官网文档（https://cloud.tencent.com/document/product/1095/51257）获取AccessToken和OpenId
 * 2.参考【企业内部应用鉴权方式】第2步，初始化代理实例
 * 3.构造请求体，并添加第1部申请到的参数到请求Header中
 * eg:
 * CreateMeetingRequest request = new CreateMeetingRequest();
 * request.setUserId("test_user");
 * request.setInstanceId(InstanceEnum.INSTANCE_MAC.getInstanceID());
 * request.setSubject("sdk 创建会议");
 * request.setType(0);
 * request.setStartTime("1619733600");
 * request.setEndTime("1619737200");
 * // 设置Header
 * request.addHeader(ReqHeaderConstants.ACCESS_TOKEN, "111111");
 * request.addHeader(ReqHeaderConstants.OPEN_ID, "2222");
 * 4.通过client发起请求
 *
 * @author tencent
 * @date 2021/4/29
 */
public class MeetingRequest {
    private static final Log log = LogFactory.getLog(MeetingRequest.class);
    // 初始化全局client
    /**
     * 初始化全局会议client
     */
    private static final MeetingClient MEETING_CLIENT;
    /**
     * 初始化全局用户client
     */
    private static final UserClient USER_CLIENT;
    private static final Gson GSON = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

    static {
        HttpProfile profile = new HttpProfile();
        // 腾讯会议分配给三方开发应用的 App ID。企业管理员可以登录 腾讯会议官网，单击右上角【用户中心】
        // 在左侧菜单栏中的【企业管理】>【高级】>【restApi】中进行查看。
        profile.setAppId("AppId");
        // 用户子账号或开发的应用 ID，企业管理员可以登录 腾讯会议官网，单击右上角【用户中心】
        // 在左侧菜单栏中的【企业管理】>【高级】>【restApi】中进行查看（如存在 SdkId 则必须填写，早期申请 API 且未分配 SdkId 的客户可不填写）。
        profile.setSdkId("SdkId");
        // 请求域名
        profile.setHost("https://api.meeting.qq.com");
        // 申请的安全凭证密钥对中的 SecretId，传入请求header，对应X-TC-Key
        profile.setSecretId("SecretId");
        // 申请的安全凭证密钥对中的 Secretkey，用户签名计算
        profile.setSecretKey("SecretKey");
        // 是否开启请求日志，开启后会打印请求和返回的详细日志
        profile.setDebug(true);
        // 设置请求超时时间，单位s
        profile.setReadTimeout(3);
        // 设置获取连接超时时间，单位s
        profile.setConnTimeout(1);

        // 初始化全局sender，也可以方法级别实例化
        RequestSender sender = new RequestSender(profile);
        // 自定义拦截器，可以忽略
        sender.addInterceptors(new Interceptor() {
            @Override
            public Response intercept(Chain chain) {
                // TODO return null; 用户自定义实现
            }
        });
        // 实例化client
        MEETING_CLIENT = new MeetingClient(sender);
        USER_CLIENT = new UserClient(sender);
        // ...
    }

    public static void main(String[] args) throws WemeetSdkException {
        CreateMeetingRequest request = new CreateMeetingRequest();
        request.setUserId("test_user");
        request.setInstanceId(InstanceEnum.INSTANCE_MAC.getInstanceID());
        request.setSubject("sdk 创建会议");
        request.setType(0);
        // OAuth2.0鉴权方式，PROFILE对象不用设置sdkId、appId、secretID、secretKey
        // request.addHeader(ReqHeaderConstants.ACCESS_TOKEN, "111111");
        // request.addHeader(ReqHeaderConstants.OPEN_ID, "2222");
        request.setStartTime("1619733600");
        request.setEndTime("1619737200");
        // 非注册用户设置
        // request.addHeader(ReqHeaderConstants.REGISTERED, "0");

        QueryMeetingDetailResponse response = MEETING_CLIENT.createMeeting(request);
        log.info(GSON.toJson(response));
    }


}
