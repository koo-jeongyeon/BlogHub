package com.plent.plantrow.domain.model;

import com.plent.plantrow.domain.entity.User;
import lombok.*;
import org.springframework.beans.BeanUtils;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRegistryDto {

    private String username;

    private String name;

    private String password;

    private String email;

    private String phone;

    private Date createdate;

    /**
     * Domain -> entity 객체 변환
     */
    public User asEntity() {
        User user = new User();
        this.createdate = new Date();
        BeanUtils.copyProperties(this, user);
        return user;
    }
}
