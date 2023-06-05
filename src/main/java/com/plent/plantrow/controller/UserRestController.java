package com.plent.plantrow.controller;

import java.util.List;

import com.plent.plantrow.domain.entity.User;
import com.plent.plantrow.domain.model.UserRegistryDto;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plent.plantrow.service.UserService;

import lombok.RequiredArgsConstructor;;
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class UserRestController {
    //@Autowired
    private final UserService userService;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    /*
     * 2022-06-28
     * 회원가입
     * koojeongyeon
     */
    @PostMapping("/join")
    public ResponseEntity join(@RequestBody UserRegistryDto userRegistryDto){
        ResponseEntity entity = null;

        userRegistryDto.setPassword(bCryptPasswordEncoder.encode(userRegistryDto.getPassword()));
        User user = userService.addUserObject(userRegistryDto);

        entity = new ResponseEntity<>(user,HttpStatus.OK);
        return entity;
    }

}
