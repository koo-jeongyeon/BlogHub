package com.bloghub.domain.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponseDto {

    private String username;

    private String name;

    private String password;

    private String email;

    private String phone;

    private Date createdate;

//    /**
//     * jpo -> Domain 객체 변환
//     */
//    public static UserResponseDto entityOf(User user){
//        UserResponseDto userResponseDto = new UserResponseDto();
//        BeanUtils.copyProperties(user, userResponseDto);
//        return userResponseDto;
//    }
//
//    /**
//     * Domain -> jpo 객체 변환
//     */
//    public User asEntity() {
//        User user = new User();
//        BeanUtils.copyProperties(this, user);
//        return user;
//    }
}
