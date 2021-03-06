package com.exam.softuni.model.binding;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginBindingModel {
    @Size(min = 3, max = 20, message = "Username length must be between 3 and 20 characters")
    private String username;
    @Size(min = 5, max = 20, message = "Password length must be between 5 and 20 characters")
    private String password;
}
