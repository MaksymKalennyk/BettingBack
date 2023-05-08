package com.example.betting.controllers;

import com.example.betting.models.User;
import com.example.betting.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/auth")
    public String login(@RequestBody User user) {
        User dbUser = userRepository.findByNickname(user.getNickname());

        if (dbUser == null) {
            ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
            return "Invalid username or password";
        }
        if (!dbUser.getPassword().equals(user.getPassword())) {
            ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
            return "Invalid username or password";
        } else {
            return user.getNickname();
        }
    }
}
