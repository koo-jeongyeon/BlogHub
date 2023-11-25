package com.bloghub.config;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class OkHttpConfig {

    @Bean("okHttpClient")
    public OkHttpClient okHttpClient() {
        return new OkHttpClient.Builder()
                // 서버 연결을 최대 10초 수행
                .connectTimeout(10, TimeUnit.SECONDS)
                // 서버 요청을 최대 10초 수행
                .writeTimeout(10, TimeUnit.SECONDS)
                // 서버 응답을 최대 10초 기다림
                .readTimeout(10, TimeUnit.SECONDS)
                .build();
    }
}