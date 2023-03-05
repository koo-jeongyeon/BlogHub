package com.plent.plantrow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plent.plantrow.dto.UserDto;
import com.plent.plantrow.entity.User;
import com.plent.plantrow.mapper.UserMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    //@Autowired
    private final UserMapper userMapper;
    @Override
    public Integer addUserObject(UserDto dto) {

        return userMapper.addUserObject(dto);
    }
}
