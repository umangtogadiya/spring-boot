package com.togadiya.umang.controller;

import com.togadiya.umang.model.UserModel;
import com.togadiya.umang.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String getWelcome() {
        return "Java Spring Boot API Demo by Umang Togadiya";
    }

    @GetMapping("/string")
    public String getString() {
        return userService.getStringService();
    }

    @GetMapping("/object")
    public UserModel getObject() {
        return userService.getObjectService();
    }

    @GetMapping("/array")
    public List<UserModel> getArray() {
        return userService.getArrayService();
    }
}
