package com.plent.plantrow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plent.plantrow.dto.UserDto;
import com.plent.plantrow.entity.User;
import com.plent.plantrow.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUserList() {

        UserDto userDto = UserDto.builder()
        .id(1)
        .build();
        
        return userMapper.selectUserList(userDto);
    }

    @Override
    public Integer addUserObject(UserDto userDto) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer editUserObject(UserDto userDto) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User getUserObject(UserDto userDto) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer deleteUserObject(UserDto userDto) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
