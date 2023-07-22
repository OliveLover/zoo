package com.zoo.zoo.controller;

import com.zoo.zoo.model.dto.CreateUserRequestDto;
import com.zoo.zoo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<String> createUser(CreateUserRequestDto requestDto) {
        return userService.createUser(requestDto);
    }
}
