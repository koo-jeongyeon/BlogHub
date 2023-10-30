package com.bloghub.service;

import java.util.List;

import com.bloghub.domain.entity.User;
import com.bloghub.domain.model.UserRegistryDto;
import org.springframework.stereotype.Component;

import com.bloghub.domain.model.*;

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
