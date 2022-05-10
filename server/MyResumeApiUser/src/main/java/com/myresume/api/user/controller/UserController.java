package com.myresume.api.user.controller;

import com.myresume.api.user.model.CreateUserModel;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/user")
public class UserController {

    @GetMapping("/status/check")
    public String status() {
        return "Working!!";
    }

    @PostMapping
    public void createUser(@Valid @RequestBody CreateUserModel userRequestModel) {

    }
}
