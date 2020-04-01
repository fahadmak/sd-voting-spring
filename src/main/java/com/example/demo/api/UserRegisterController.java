package com.example.demo.api;

import com.example.demo.model.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserRegisterController {
    @Autowired
    UserService userService;

    @PostMapping("/register")
    public void registerVoter(@RequestBody User user) {
        user.setActive(true);
        user.setRole("USER");
        userService.addUser(user);
    }

    @GetMapping("/")
    public List<User> getAllUsers() {
        return userService.getAllUser();
    }

    @GetMapping("/users/{userId}")
    public User getAllUserById(@PathVariable Long userId) {
        return userService.getUserById(userId);
    }
}
