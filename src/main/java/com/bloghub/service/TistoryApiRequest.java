package com.bloghub.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.bloghub.domain.model.PostWriteRequestDto;
import com.bloghub.domain.model.PostWriteResponseDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TistoryApiRequest {

    private final OkHttpClient okHttpClient;
    private final ObjectMapper objectMapper;
    private final String POST_WRITE_URL = "https://www.tistory.com/apis/post/write";
    private final String ACCESS_TOKEN = "";
    private final String OUTPUT = "json";
    private final String BLOG_NAME = "hananewsbm";

    @Autowired
    public TistoryApiRequest(@Qualifier("okHttpClient") OkHttpClient okHttpClient, ObjectMapper objectMapper) {
        this.okHttpClient = okHttpClient;
        this.objectMapper = objectMapper;
    }

    public PostWriteResponseDto sendPostWrite(PostWriteRequestDto postWriteRequestDto) {
        // Query Parameters
        HttpUrl.Builder urlBuilder = HttpUrl.parse(POST_WRITE_URL).newBuilder();
        urlBuilder.addQueryParameter("access_token", ACCESS_TOKEN);
        urlBuilder.addQueryParameter("output", OUTPUT);
        urlBuilder.addQueryParameter("blogName", BLOG_NAME);
        urlBuilder.addQueryParameter("title", postWriteRequestDto.getTitle());
        urlBuilder.addQueryParameter("visibility", postWriteRequestDto.getVisibility());
        urlBuilder.addQueryParameter("category", postWriteRequestDto.getCategory());
        urlBuilder.addQueryParameter("tag", postWriteRequestDto.getTag());
        urlBuilder.addQueryParameter("content", postWriteRequestDto.getContent());

        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        // Request
        Request request = new Request.Builder()
                .url(urlBuilder.build())
                .method("POST",body)
                .build();

        try {
            // Execute the request and get the response
            Response response = okHttpClient.newCall(request).execute();

            // Parse the JSON response using ObjectMapper
            PostWriteResponseDto tistoryResponse = objectMapper.readValue(
                    response.body().string(),
                    PostWriteResponseDto.class
            );

            System.out.println("tistoryResponse : " + tistoryResponse);

            // Close the response to release resources
            response.close();
            return tistoryResponse;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
