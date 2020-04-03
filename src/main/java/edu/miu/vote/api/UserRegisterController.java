package edu.miu.vote.api;

import edu.miu.vote.model.User;
import edu.miu.vote.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserRegisterController {
    @Autowired
    UserService userService;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/register")
    public void registerVoter(@RequestBody User user) {
        user.setActive(true);
        user.setRole("USER");
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userService.addUser(user);
    }

    @GetMapping("/view")
    public List<User> getAllUsers() {
        return userService.getAllUser();
    }

}
