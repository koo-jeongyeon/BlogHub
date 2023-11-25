package com.bloghub.service;

import com.bloghub.domain.model.PostWriteRequestDto;
import com.bloghub.domain.model.PostWriteResponseDto;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Component
public interface UploadService {

    //티스토리 글 작성
    public PostWriteResponseDto TistoryContentUpload(PostWriteRequestDto postWriteRequestDto);

    //티스토리 파일 첨부
    public List<String> TistoryImageUpload(MultipartFile multipartFile);
}
