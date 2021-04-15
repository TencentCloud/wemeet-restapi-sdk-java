/*
 * Copyright (c) 2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.tencentcloudapi.wemeet.common.http;

import com.squareup.okhttp.*;
import com.tencentcloudapi.wemeet.common.exception.WemeetSdkException;

import java.io.IOException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

/**
 * <p>会议相关</p>
 *
 * @author tencent
 * @date 2021/4/6
 */
public class HttpConnection {

    private final OkHttpClient client;

    public HttpConnection(Integer connTimeout, Integer readTimeout, Integer writeTimeout) {
        this.client = new OkHttpClient();
        this.client.setConnectTimeout(connTimeout, TimeUnit.SECONDS);
        this.client.setReadTimeout(readTimeout, TimeUnit.SECONDS);
        this.client.setWriteTimeout(writeTimeout, TimeUnit.SECONDS);
    }

    public void addInterceptors(Interceptor interceptor) {
        this.client.interceptors().add(interceptor);
    }

    public void setProxy(Proxy proxy) {
        this.client.setProxy(proxy);
    }

    public void setAuthenticator(Authenticator authenticator) {
        this.client.setAuthenticator(authenticator);
    }

    public Response doRequest(Request request) throws WemeetSdkException {
        Response response;
        try {
            response = this.client.newCall(request).execute();
        } catch (IOException e) {
            throw new WemeetSdkException(e.getClass().getName() + "-" + e.getMessage());
        }
        return response;
    }

    public Response getRequest(String url) throws WemeetSdkException {
        Request request;
        try {
            request = new Request.Builder().url(url).get().build();
        } catch (IllegalArgumentException e) {
            throw new WemeetSdkException(e.getClass().getName() + "-" + e.getMessage());
        }

        return this.doRequest(request);
    }

    public Response getRequest(String url, Headers headers) throws WemeetSdkException {
        Request request = null;
        try {
            request = new Request.Builder().url(url).headers(headers).get().build();
        } catch (IllegalArgumentException e) {
            throw new WemeetSdkException(e.getClass().getName() + "-" + e.getMessage());
        }

        return this.doRequest(request);
    }

    public Response postRequest(String url, String body) throws WemeetSdkException {
        MediaType contentType = MediaType.parse("application/x-www-form-urlencoded");
        Request request;
        try {
            request = new Request.Builder().url(url).post(RequestBody.create(contentType, body)).build();
        } catch (IllegalArgumentException e) {
            throw new WemeetSdkException(e.getClass().getName() + "-" + e.getMessage());
        }

        return this.doRequest(request);
    }

    public Response postRequest(String url, String body, Headers headers)
            throws WemeetSdkException {
        MediaType contentType = MediaType.parse(headers.get("Content-Type"));
        Request request;
        try {
            request = new Request.Builder()
                    .url(url)
                    .post(RequestBody.create(contentType, body))
                    .headers(headers)
                    .build();
        } catch (IllegalArgumentException e) {
            throw new WemeetSdkException(e.getClass().getName() + "-" + e.getMessage());
        }

        return this.doRequest(request);
    }

    public Response postRequest(String url, byte[] body, Headers headers)
            throws WemeetSdkException {
        MediaType contentType = MediaType.parse(headers.get("Content-Type"));
        Request request;
        try {
            request = new Request.Builder()
                    .url(url)
                    .post(RequestBody.create(contentType, body))
                    .headers(headers)
                    .build();
        } catch (IllegalArgumentException e) {
            throw new WemeetSdkException(e.getClass().getName() + "-" + e.getMessage());
        }

        return this.doRequest(request);
    }
}
