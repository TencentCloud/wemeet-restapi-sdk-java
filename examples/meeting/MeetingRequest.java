package meeting;

import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.MediaType;
import com.wemeet.restapi.common.RequestSender;
import com.wemeet.restapi.common.TerminalData;
import com.wemeet.restapi.common.constants.InstanceEnum;
import com.wemeet.restapi.common.exception.WemeetSdkException;
import com.wemeet.restapi.common.profile.HttpProfile;
import com.wemeet.restapi.models.meeting.QueryMeetingDetailResponse;
import com.wemeet.restapi.models.meeting.UpdateMeetingRequest;
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
        // 根据会议ID查询会议
        QueryMeetingDetailResponse response = queryMeetingById("12224214", "test",
                InstanceEnum.INSTANCE_MAC.getInstanceID() + "");
        // 修改会议
        UpdateMeetingRequest request = new UpdateMeetingRequest();
        request.setUserId("test");
        request.setInstanceId(InstanceEnum.INSTANCE_MAC.getInstanceID());
        request.setSubject("修改会议");
        QueryMeetingDetailResponse upResp = updateMeeting(request, "1232515");
    }

    // queryMeetingById 根据会议ID查询会议
    public QueryMeetingDetailResponse queryMeetingById(String meetingId, String userId, String instanceId) throws WemeetSdkException {
        // 2.构建Request请求data
        TerminalData data = new TerminalData();
        // 请求路径
        data.setUri("/v1/meetings/" + meetingId);
        // 请求参数 url路径？后的参数
        data.addParams("userid", userId);
        data.addParams("instanceid", instanceId);
        // 请求方式 GET/POST/DELETE/PUT...
        data.setMethod("GET");
        // 企业内部应用鉴权方式，只需要设置三个header即可
        // appId
        data.addHeader("AppId", PROFILE.getAppId());
        // sdkId
        data.addHeader("SdkId", PROFILE.getSdkId());
        // 是否注册用户
        data.addHeader("X-TC-Registered", "1");
        // 3.构建调用对象
        RequestSender sender = new RequestSender(PROFILE);
        // 4.发起调用
        QueryMeetingDetailResponse response = sender.get(data, new TypeToken<QueryMeetingDetailResponse>() {
        });
        // 5.获取返回结果，处理
        log.info(GSON.toJson(response));
        return response;
    }

    // updateMeeting 修改会议
    public QueryMeetingDetailResponse updateMeeting(UpdateMeetingRequest request, String meetingId) throws WemeetSdkException {
        TerminalData data = new TerminalData();
        data.setUri("/v1/meetings/" + meetingId);
        data.setBody(request);
        data.setMethod("PUT");
        data.addHeader("AppId", PROFILE.getAppId());
        data.addHeader("SdkId", PROFILE.getSdkId());
        data.addHeader("X-TC-Registered", "1");

        QueryMeetingDetailResponse response = DEFAULT_SENDER.request(data, new TypeToken<QueryMeetingDetailResponse>() {
        }, MediaType.parse("Content-Type: application/json"));
        log.info(GSON.toJson(response));
        return response;
    }


}