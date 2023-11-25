package com.bloghub.service;

import com.bloghub.domain.model.PostWriteRequestDto;
import com.bloghub.domain.model.PostWriteResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.bloghub.config.OkHttpConfig;

import java.util.List;

@Slf4j
@Service
public class UploadServiceImpl implements UploadService {

    @Autowired
    public TistoryApiRequest tistoryApiRequest;
    @Override
    public PostWriteResponseDto TistoryContentUpload(PostWriteRequestDto postWriteRequestDto) {

        PostWriteResponseDto postWriteResponseDto = tistoryApiRequest.sendPostWrite(postWriteRequestDto);

        if (postWriteResponseDto.getTistory().getStatus().equals("200")) {
            System.out.println("업로드 성공");
        } else {
            System.out.println("업로드 실패");
        }

        return postWriteResponseDto;
    }

    @Override
    public List<String> TistoryImageUpload(MultipartFile multipartFile) {
        return null;
    }
}
