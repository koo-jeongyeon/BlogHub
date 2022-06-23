package com.plent.plantrow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plent.plantrow.entity.User;
import com.plent.plantrow.service.UserService;

@RestController
public class UserRestController {
    
    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public ResponseEntity testCheck(){
        ResponseEntity entity = null;

        List<User> user = userService.selectUserList();
        //commit후 잔디가 안심어지는 오류가 있어서 수정 확인
        
        entity = new ResponseEntity<>(user,HttpStatus.OK);

        System.out.println(entity);
        return entity;
    }
}
