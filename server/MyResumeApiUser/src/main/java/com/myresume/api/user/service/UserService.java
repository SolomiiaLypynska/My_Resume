package com.myresume.api.user.service;

import com.myresume.api.user.entity.UserEntity;
import com.myresume.api.user.model.CreateUserModel;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    UserEntity createUser(CreateUserModel userModel);

    UserEntity getUserByEmail(String email);
}
