package com.plent.plantrow.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/api")
public class UserRestController {
    
    //@Autowired
    private final UserService userService;

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
    public ResponseEntity loginCheck(@RequestBody UserDto dto){
        ResponseEntity entity = null; 
        System.out.println(dto.toString());
        User user = userService.getUserObject(dto);
        entity = new ResponseEntity<>(user,HttpStatus.OK);

        System.out.println("login:" + entity);
        return entity;
    }
    /*
     * 2022-06-28
     * 회원가입
     * koojeongyeon
     */
    @PostMapping("/join")
    public ResponseEntity join(@RequestBody UserDto dto){
        ResponseEntity entity = null; 

        Integer result = userService.addUserObject(dto);

        entity = new ResponseEntity<>(result,HttpStatus.OK);
        return entity;
    }

}
