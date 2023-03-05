package com.plent.plantrow.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.plent.plantrow.dto.UserDto;
import com.plent.plantrow.entity.User;

@Component
public interface UserMapper {

    public Integer addUserObject(UserDto dto);

    public User findByUsername(String username);

}