package com.plent.plantrow.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plent.plantrow.entity.User;
import com.plent.plantrow.service.UserService;
import com.plent.plantrow.dto.UserDto;

import lombok.RequiredArgsConstructor;;

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
    public ResponseEntity join(@RequestBody UserDto user){
        ResponseEntity entity = null;

        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Integer result = userService.addUserObject(user);

        entity = new ResponseEntity<>(result,HttpStatus.OK);
        return entity;
    }

}
