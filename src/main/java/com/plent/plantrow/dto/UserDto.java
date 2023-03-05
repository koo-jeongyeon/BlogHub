package com.plent.plantrow.dto;

import com.plent.plantrow.entity.User;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    
    private String username;

    private String name;

    private String password;

    private String email;

    private String phone;

    private String roles;
 
}
