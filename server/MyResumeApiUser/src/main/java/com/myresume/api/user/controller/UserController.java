package com.myresume.api.user.controller;

import com.myresume.api.user.entity.UserEntity;
import com.myresume.api.user.model.CreateUserModel;
import com.myresume.api.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/status/check")
    public String status() {
        return "Working!!";
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE},
    produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<UserEntity> createUser(@Valid @RequestBody CreateUserModel userRequestModel) {
        UserEntity userEntity = userService.createUser(userRequestModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(userEntity);
    }
}
