package edu.miu.vote.api;

import edu.miu.vote.model.User;
import edu.miu.vote.services.UserService;
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

    @GetMapping("/view")
    public List<User> getAllUsers() {
        return userService.getAllUser();
    }

}
