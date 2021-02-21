package com.exam.softuni.model.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserServiceModel {
    private Long id;
    private String username;
    private String fullName;
    private String password;
    private String email;
}
