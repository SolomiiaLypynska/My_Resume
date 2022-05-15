package com.myresume.api.user.controller;

import com.myresume.api.user.model.CreateUserModel;
import com.myresume.api.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @PostMapping
    public ResponseEntity createUser(@Valid @RequestBody CreateUserModel userRequestModel) {
        userService.createUser(userRequestModel);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
