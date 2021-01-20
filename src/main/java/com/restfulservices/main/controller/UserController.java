package com.restfulservices.main.controller;

import com.restfulservices.main.model.request.UserDetailsRequestModel;
import com.restfulservices.main.model.response.UserRest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {
    @GetMapping
    public String getUser() {
        return "get user";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {
        return null;

    }

    @PutMapping
    public  String updateUser() {
        return "update user";
    }

    @DeleteMapping
    public  String deleteUser() {
        return "delete user";
    }
}
