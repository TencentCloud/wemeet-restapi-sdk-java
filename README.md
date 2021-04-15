
# 简介
欢迎使用腾讯会议开发者工具套件（SDK）1.1.0，为方便 JAVA 开发者调试和接入腾讯云会议 API，这里向您介绍适用于 Java 的腾讯会议开发工具包，并提供首次使用开发工具包的简单示例。让您快速获取腾讯会议 Java SDK 并开始调用。
# 依赖环境
1.依赖环境：JDK 7 版本及以上。
2.购买腾讯会议企业版获取 SecretID、SecretKey，接入的企业 AppId。

# 获取安装
安装 Java SDK 前,先获取安全凭证。在第一次使用云API之前，用户首先需要在腾讯云控制台上申请安全凭证，安全凭证包括 SecretID 和 SecretKey，SecretID 是用于标识 API 调用者的身份，SecretKey 是用于加密签名字符串和服务器端验证签名字符串的密钥 SecretKey 必须严格保管，避免泄露。
## 通过 Maven 安装(推荐)
通过 Maven 获取安装是使用 JAVA SDK 的推荐方法，Maven 是 JAVA 的依赖管理工具，支持您项目所需的依赖项，并将其安装到项目中。关于 Maven 详细可参考 Maven 官网。
1. 请访问[Maven官网](https://maven.apache.org/)下载对应系统Maven安装包进行安装；
2. 为您的项目添加 Maven 依赖项，只需在 Maven pom.xml 添加以下依赖项即可。注意这里的版本号只是举例，您可以在[Maven仓库](https://search.maven.org/search?q=wemeet-restapi-sdk-java)上找到最新的版本(最新版本是1.1.0)
3. maven仓库中显示的4.0.11是废弃版本，由于maven索引更新问题尚未完全删除;
4. 引用方法可参考示例。
```xml
<dependency>
    <groupId>com.tencentcloudapi.wemeet</groupId>
    <artifactId>wemeet-restapi-sdk-java</artifactId>
    <!-- go to https://search.maven.org/search?q=wemeet-restapi-sdk-java and get the latest version. -->
    <!-- 请到https://search.maven.org/search?q=wemeet-restapi-sdk-java查询所有版本，最新版本如下 -->
    <version>1.1.0</version>
</dependency>
```
5. 如上引用方式会将腾讯云所有产品sdk下载到本地，代码中使用方式可参考示例。最新版本也可在[Maven仓库](https://search.maven.org/search?q=wemeet-restapi-sdk-java)查询，可大大节省存储空间。
6. 中国大陆地区的用户可以使用镜像源加速下载，编辑 maven 的 settings.xml 配置文件，在 mirrors 段落增加镜像配置：
```
    <mirror>
      <id>tencent</id>
      <name>tencent maven mirror</name>
      <url>https://mirrors.tencent.com/nexus/repository/maven-public/</url>
      <mirrorOf>*</mirrorOf>
    </mirror>
```

## 通过源码包安装
1. 前往 [Github 代码托管地址](https://github.com/tencentcloud/wemeet-restapi-sdk-java) 下载源码压缩包；
2. 解压源码包到您项目合适的位置；
3. 需要将vendor目录下的jar包放在java的可找到的路径中；
4. 引用方法可参考示例。

# 示例

以查询实例接口queryMeetingById、修改会议接口updateMeeting为例：


```java
import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.MediaType;
import RequestSender;
import TerminalData;
import InstanceEnum;
import WemeetSdkException;
import HttpProfile;
import QueryMeetingDetailResponse;
import UpdateMeetingRequest;
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
```


## 更多示例

您可以在[github](https://github.com/tencentcloud/wemeet-restapi-sdk-java)中examples目录下找到更多详细的示例。

# 相关配置

## 支持打印日志
SDK 支持打印日志。
首先，在创建 HttpProfile 对象时，设置 debug 模式为真,会打印sdk异常信息和流量信息
```
      HttpProfile profilerofile = new HttpProfile();
      profilerofile.setDebug(true);
```

腾讯云java sdk 使用commons.logging类进行打印日志,如下所示。

```
四月 14, 2021 11:39:06 上午 RequestSender info
信息: send request, request url: https://api.meeting.qq.com/v1/meetings/1212425215?userid=test&instanceid=2. request headers information: X-TC-Key: 111111111*********;X-TC-Nonce: 953034268;X-TC-Registered: 1;AppId: 11111111;X-TC-Signature: ******;X-TC-Timestamp: 1111111111;SdkId: 124122;
四月 14, 2021 11:39:09 上午 RequestSender info
信息: recieve response, response url: https://api.meeting.qq.com/v1/meetings/1232421521?userid=test&instanceid=2, response headers: Date: Wed, 14 Apr 2021 03:39:09 GMT;Content-Type: application/json; charset=utf-8;Content-Length: 962;Connection: keep-alive;Server: nginx;X-Tc-Trace: 124215125151;Access-Control-Allow-Origin: *;OkHttp-Selected-Protocol: http/1.1;OkHttp-Sent-Millis: 1618371546860;OkHttp-Received-Millis: 1618371549096;,response body information: com.squareup.okhttp.internal.http.RealResponseBody@42ed8181
四月 14, 2021 11:39:09 上午 com.wemeet.restapi.service.impl.MeetingServiceImpl queryMeetingById
```
用户可以根据自己的需要配置日志打印类,如log4j
配置方法如下:
+ 配置pom文件,设置log4j版本。

```
    <dependency>
      <groupId>log4j</groupId>
      <artifactId>log4j</artifactId>
      <version>1.2.17</version>
    </dependency>
```
+ 设置环境变量为log4j, 并创建log类

```
System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Log4JLogger");
Log logger = LogFactory.getLog("TestLog");
logger.info("hello world");
```

# 其他问题

## 版本升级

## 依赖冲突

目前，SDK 依赖 okhttp 2.5.0，如果和其他依赖 okhttp3 的包混用时，有可能会报错，例如:`Exception in thread "main" java.lang.NoSuchMethodError: okio.BufferedSource.rangeEquals(JLokio/ByteString;)Z`。原因是 okhttp3 依赖 okio 1.12.0，而 okhttp 依赖 okio 1.6.0，maven 在解析依赖时的规则是路径最短优先和顺序优先，所以如果 SDK 在 pom.xml 依赖中先被声明，则 okio 1.6.0 会被使用，从而报错。在 SDK 没有升级到 okhttp3 前的解决办法：1）在 pom.xml 中明确指定依赖 okio 1.12.0 版本（注意可能有其他包需要用到更高的版本，变通下取最高版本就可以了）；2）将 SDK 放在依赖的最后（注意如果此前已经编译过，需要先删除掉 maven 缓存的 okhttp 包），以同时使用依赖 okhttp3 的 CMQ SDK 为例，形如（注意变通版本号）：

```
    <dependency>
      <groupId>com.qcloud</groupId>
      <artifactId>cmq-http-client</artifactId>
      <version>1.0.7</version>
    </dependency>
    <dependency>
      <groupId>com.tencentcloudapi.wemeet</groupId>
      <artifactId>wemeet-restapi-sdk-java</artifactId>
      <version>1.1.0</version>
    </dependency>
```

## 证书问题

证书问题通常是客户端环境配置错误导致的。SDK 没有对证书进行操作，依赖的是 Java 运行环境本身的处理。出现证书问题后，可以使用`-Djavax.net.debug=ssl`开启详细日志辅助判断。

有用户报告使用 IBM JDK 1.8 出现证书报错：`javax.net.ssl.SSLHandshakeException: Received fatal alert: handshake_failure`，使用 Oracle JDK 后问题消失。
