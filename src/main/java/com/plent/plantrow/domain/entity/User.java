package com.plent.plantrow.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private String username;

    @Column
    private String name;

    @Column
    private String password;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private Date createdate;

}
