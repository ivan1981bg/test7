package com.softuni.webexam.service;

import com.softuni.webexam.model.entity.User;
import com.softuni.webexam.model.service.UserServiceModel;

public interface UserService {
    boolean register(UserServiceModel userServiceModel);

    UserServiceModel findByUsernameAndPassword(String username, String password);
    User findUserByUsername(String username);
}
