package com.exam.softuni.service;

import com.exam.softuni.model.entity.User;
import com.exam.softuni.model.service.UserServiceModel;

public interface UserService {

    void addToDatabase(UserServiceModel map);

    User findByUsernameAndPassword(String username, String password);
}
