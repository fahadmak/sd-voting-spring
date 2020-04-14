package edu.miu.vote.controller;

import edu.miu.vote.domain.AuthResponse;
import edu.miu.vote.domain.User;
import edu.miu.vote.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
public class UserRegisterController {

    @Autowired
    UserService userService;

    @PostMapping("/users")
    public ResponseEntity<?> registerUser(@RequestBody User user) throws URISyntaxException {
        String token = userService.signUp(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(location).body(new AuthResponse(token));
    }



}
