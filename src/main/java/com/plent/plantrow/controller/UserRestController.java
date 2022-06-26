package com.plent.plantrow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plent.plantrow.entity.User;
import com.plent.plantrow.service.UserService;

@RestController
@RequestMapping("/api")
public class UserRestController {
    
    @Autowired
    private UserService userService;

    /*
     * 테스트용
     */
    @GetMapping("/test")
    public ResponseEntity testCheck(){
        ResponseEntity entity = null;

        List<User> user = userService.selectUserList();

        entity = new ResponseEntity<>(user,HttpStatus.OK);

        System.out.println(entity);
        return entity;
    }

    /*
     * 2022-06-26
     * 로그인
     * koojeongyeon
     */
    @PostMapping("/login")
    public ResponseEntity loginCheck(){
        ResponseEntity entity = null; 

        List<User> user = userService.selectUserList();

        User userOne = user.get(0);

        entity = new ResponseEntity<>(userOne,HttpStatus.OK);

        System.out.println("login:" + entity);
        return entity;
    }

}
