package com.restfulservices.main.controller;

import com.restfulservices.main.model.request.UserDetailsRequestModel;
import com.restfulservices.main.model.response.UserRest;
import com.restfulservices.main.service.UserService;
import com.restfulservices.main.shared.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public String getUser() {
        return "get user";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {
        UserRest returnValue = new UserRest();

        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userDetails,userDto);

        UserDto createdUser = userService.createUser(userDto);
        BeanUtils.copyProperties(createdUser, returnValue);

        return returnValue;

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
