package com.plent.plantrow.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.plent.plantrow.dto.UserDto;
import com.plent.plantrow.entity.User;

@Component
public interface UserService {
    /*
     * 2022-06-24
     * koojeongyeon
     * 회원가입
     */
    public Integer addUserObject(UserDto dto);

}
