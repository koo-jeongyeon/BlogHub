package com.plent.plantrow.service;

import java.util.List;

import com.plent.plantrow.domain.entity.User;
import com.plent.plantrow.domain.model.UserRegistryDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plent.plantrow.domain.repository.UserRepository;

import lombok.RequiredArgsConstructor;
@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    @Autowired
    private final UserRepository userRepository;

    @Override
    public List<com.plent.plantrow.domain.entity.User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User addUserObject(UserRegistryDto userRegistryDto) {
        return userRepository.save(userRegistryDto.asEntity());
    }

}
