package com.plent.plantrow.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.plent.plantrow.entity.User;

@Component
public interface UserService {

    public List<User> selectUserList();
    
    
}
