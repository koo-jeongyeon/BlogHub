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
    public List<User> selectUserList() {

        UserDto userDto = UserDto.builder()
        .id(1)
        .build();
        
        return userMapper.selectUserList(userDto);
    }

    @Override
    public Integer addUserObject(UserDto dto) {

        return userMapper.addUserObject(dto.toEntity());
    }

    @Override
    public Integer editUserObject(UserDto dto) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User getUserObject(UserDto dto) {

        return userMapper.getUserObject(dto.toEntity());
    }

    @Override
    public Integer deleteUserObject(UserDto dto) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
