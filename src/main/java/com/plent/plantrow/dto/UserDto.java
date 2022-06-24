package com.plent.plantrow.dto;

import com.plent.plantrow.entity.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private int id;
    
    private String nickname;

    private String name;

    private String password;

    private String email;

    private String phone;

    public User toEntity(){
        return User.builder()
        .id(id)
        .nickname(nickname)
        .name(name)
        .password(password)
        .email(email)
        .phone(phone)
        .build();
    }
 
}
