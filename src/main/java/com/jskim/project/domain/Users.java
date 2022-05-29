package com.jskim.project.domain;

import lombok.*;

import javax.persistence.*;


@Entity
@Data
public class Users {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = true, length = 20)
    private String email;
    @Column(nullable = true, length = 20)
    private String password;
    @Column(nullable = true, length = 20)
    private String name;
    @Column(nullable = true, length = 20)
    private String phone_num;
    @Column(nullable = false, length = 20)
    private String birth_date;
    @Column(nullable = false, length = 45)
    private String address;
    @Column(nullable = false, length = 45)
    private String address_detail;
    @Column(nullable = false, length = 10)
    private String role;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false, length = 20)
    private String insert_timestamp;
    @Column(nullable = false, length = 20)
    private String update_timestamp;
}
