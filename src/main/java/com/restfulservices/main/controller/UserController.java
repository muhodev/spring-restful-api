package com.restfulservices.main.controller;

import com.restfulservices.main.model.request.UserDetailsRequestModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {
    @GetMapping
    public String getUser() {
        return "get user";
    }

    @PostMapping
    public String createUser(@RequestBody UserDetailsRequestModel userDetails) {
        return "create user";

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
