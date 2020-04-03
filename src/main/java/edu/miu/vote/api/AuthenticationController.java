package edu.miu.vote.api;

import edu.miu.vote.model.AuthCredentials;
import edu.miu.vote.model.AuthResponse;
import edu.miu.vote.model.MyUserDetails;
import edu.miu.vote.security.JWTUtil;
import edu.miu.vote.security.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserDetailsServiceImpl userDetailsService;

    @Autowired
    JWTUtil jwtUtil;

    @RequestMapping("/")
    public String index() {
        return "Hello social distancers";
    }

    @RequestMapping("/accessdenied")
    public String access() {
        return "Acces denied";
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthCredentials authCredentials) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authCredentials.getUsername(),
                    authCredentials.getPassword()));
        } catch (BadCredentialsException e) {
            throw new Exception("Incorrect user name or password");
        }

        UserDetails userDetails = userDetailsService.loadUserByUsername(authCredentials.getUsername());
        String jwtToken = jwtUtil.generateToken(userDetails);
        return ResponseEntity.ok(new AuthResponse(jwtToken));
    }
}
