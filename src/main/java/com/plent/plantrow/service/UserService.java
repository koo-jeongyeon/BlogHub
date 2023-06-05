package com.plent.plantrow.service;

import java.util.List;

import com.plent.plantrow.domain.entity.User;
import org.springframework.stereotype.Component;

import com.plent.plantrow.domain.model.*;

@Component
public interface UserService {
    /*
     * 2022-06-24
     * koojeongyeon
     * 회원가입
     */
    public User addUserObject(UserRegistryDto dto);

    public List<User> getUserList();

    public User findByUsername(String username);


}
