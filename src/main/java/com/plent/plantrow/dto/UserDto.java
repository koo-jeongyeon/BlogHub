package com.plent.plantrow.dto;

import com.plent.plantrow.entity.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private int id;
    
    private String homeid;

    private String name;

    private String password;

    private String email;

    private String phone;

    public UserDto(User entity){
        this.id = entity.getId();
        this.homeid = entity.getHomeid();
        this.name = entity.getName();
        this.password = entity.getPassword();
        this.email = entity.getEmail();
        this.phone = entity.getPhone();
    }

    public User toEntity(){
        return User.builder()
        .id(id)
        .homeid(homeid)
        .name(name)
        .password(password)
        .email(email)
        .phone(phone)
        .build();
    }
 
}
