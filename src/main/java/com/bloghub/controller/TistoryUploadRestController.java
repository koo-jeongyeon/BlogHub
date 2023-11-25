package com.bloghub.controller;

import com.bloghub.domain.entity.User;
import com.bloghub.domain.model.PostWriteRequestDto;
import com.bloghub.domain.model.PostWriteResponseDto;
import com.bloghub.domain.model.UserRegistryDto;
import com.bloghub.service.UploadService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class TistoryUploadRestController {

    @Autowired
    private final UploadService uploadService;

    @PostMapping("/upload")
    public ResponseEntity upload(@RequestBody PostWriteRequestDto postWriteRequestDto){
        ResponseEntity entity = null;

        PostWriteResponseDto response = uploadService.TistoryContentUpload(postWriteRequestDto);

        entity = new ResponseEntity<>(response, HttpStatus.OK);
        return entity;
    }



}
