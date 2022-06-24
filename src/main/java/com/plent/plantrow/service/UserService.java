package com.plent.plantrow.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.plent.plantrow.dto.UserDto;
import com.plent.plantrow.entity.User;

@Component
public interface UserService {

    public List<User> selectUserList();

    /*
     * 2022-06-24
     * koojeongyeon
     * 회원가입
     */
    public Integer addUserObject(UserDto userDto);
    
    /*
     * 2022-06-24
     * koojeongyeon
     * 회원 정보 수정
     */
    public Integer editUserObject(UserDto userDto);

    /*
     * 2022-06-24
     * koojeongyeon
     * 회원 조회
     */
    public User getUserObject(UserDto userDto);

    /*
     * 2022-06-24
     * koojeongyeon
     * 회원 탈퇴
     */
    public Integer deleteUserObject(UserDto userDto);
}
