package meeting;

import com.squareup.okhttp.Interceptor;
import com.wemeet.restapi.client.MeetingClient;
import com.wemeet.restapi.common.RequestSender;
import com.wemeet.restapi.common.constants.InstanceEnum;
import com.wemeet.restapi.common.exception.WemeetSdkException;
import com.wemeet.restapi.common.profile.HttpProfile;
import com.wemeet.restapi.models.meeting.QueryMeetingDetailResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MeetingRequest {

    private static final Log log = LogFactory.getLog(MeetingRequest.class);


    private static final HttpProfile PROFILE;
    private static final RequestSender DEFAULT_SENDER;
    private static final Gson GSON;

    // 1.初始化全局HttpProfile
    static {
        PROFILE = new HttpProfile();
        // 腾讯会议分配给三方开发应用的 App ID。企业管理员可以登录 腾讯会议官网，单击右上角【用户中心】
        // 在左侧菜单栏中的【企业管理】>【高级】>【restApi】中进行查看。
        PROFILE.setAppId("AppId");
        // 用户子账号或开发的应用 ID，企业管理员可以登录 腾讯会议官网，单击右上角【用户中心】
        // 在左侧菜单栏中的【企业管理】>【高级】>【restApi】中进行查看（如存在 SdkId 则必须填写，早期申请 API 且未分配 SdkId 的客户可不填写）。
        PROFILE.setSdkId("SdkId");
        // 请求域名
        PROFILE.setHost("https://api.meeting.qq.com");
        // 申请的安全凭证密钥对中的 SecretId，传入请求header，对应X-TC-Key
        PROFILE.setSecretId("SecretId");
        // 申请的安全凭证密钥对中的 Secretkey，用户签名计算
        PROFILE.setSecretKey("SecretKey");
        // 是否开启请求日志
        PROFILE.setDebug(true);
        // 设置请求超时时间，单位s
        PROFILE.setReadTimeout(3);
        // 设置获取连接超时时间，单位s
        PROFILE.setConnTimeout(1);

        GSON = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

        // 初始化全局sender，也可以方法级别实例化
        DEFAULT_SENDER = new RequestSender(PROFILE);
        // 自定义拦截器，eg：打印日志
        DEFAULT_SENDER.addInterceptors(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                return null;
            }
        });
    }

    public static void main(String[] args) throws WemeetSdkException {
        CreateMeetingRequest request = new CreateMeetingRequest();
        request.setUserId("test");
        request.setInstanceId(InstanceEnum.INSTANCE_MAC.getInstanceID());
        request.setSubject("sdk 创建会议");
        request.setType(0);
//        request.addHeader(ReqHeaderConstants.ACCESS_TOKEN, "111111");
//        request.addHeader(ReqHeaderConstants.OPEN_ID, "2222");

        request.setStartTime("1619733600");
        request.setEndTime("1619737200");

        HttpProfile profile = new HttpProfile();
        profile.setAppId("1111");
        profile.setSdkId("111111");
        profile.setHost("https://api-test.meeting.qq.com");
        profile.setSecretId("1111111");
        profile.setSecretKey("1111111");

        RequestSender sender = new RequestSender(profile);

        MeetingClient client = new MeetingClient(sender);
        QueryMeetingDetailResponse response = client.createMeeting(request);
        System.out.println(response);
    }


}