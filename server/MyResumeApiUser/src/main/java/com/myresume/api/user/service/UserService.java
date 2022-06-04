package com.myresume.api.user.service;

import com.myresume.api.user.entity.User;
import com.myresume.api.user.model.CreateUserModel;

public interface UserService {

    User createUser(CreateUserModel userModel);
}
