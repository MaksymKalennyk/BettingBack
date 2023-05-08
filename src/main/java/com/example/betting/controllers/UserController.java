package com.example.betting.controllers;

import com.example.betting.models.User;
import com.example.betting.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/submit")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/login")
    public List<User> logUser(){
        System.out.println(userService.findAll());
        return userService.findAll();
    }
}
