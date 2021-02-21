package com.exam.softuni.model.binding;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRegisterBindingModel {
    @Size(min = 3, max = 20, message = "Username length must be between 3 and 20 characters")
    private String username;
    @Size(min = 3, max = 20, message = "Full Name length must be between 3 and 20 characters")
    private String fullName;
    @Email
    private String email;
    @Size(min = 5, max = 20, message = "Password length must be between 5 and 20 characters")
    private String password;
    @Size(min = 5, max = 20, message = "Confirm Password length must be between 5 and 20 characters")
    private String confirmPassword;
}
