package edu.miu.vote.controller;

import edu.miu.vote.domain.AuthCredentials;
import edu.miu.vote.domain.AuthResponse;
import edu.miu.vote.security.JWTUtil;
import edu.miu.vote.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserService userService;

    @Autowired
    JWTUtil jwtUtil;

    @RequestMapping("/")
    public String index() {
        return "Hello social distancers";
    }

    @RequestMapping("/accessdenied")
    public String access() {
        return "Access denied";
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthCredentials authCredentials) throws Exception {
        return ResponseEntity.ok(new AuthResponse(userService.signIn(authCredentials)));
    }
}
