package com.restfulservices.main.service;

import com.restfulservices.main.shared.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto user);
}
