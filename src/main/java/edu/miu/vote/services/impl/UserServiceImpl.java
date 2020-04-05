package edu.miu.vote.services.impl;

import edu.miu.vote.dao.UserRepository;
import edu.miu.vote.domain.AuthCredentials;
import edu.miu.vote.domain.User;
import edu.miu.vote.exception.InvalidUserNameException;
import edu.miu.vote.exception.UsersAlreadyExistsException;
import edu.miu.vote.security.JWTUtil;
import edu.miu.vote.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

        @Autowired
        AuthenticationManager authenticationManager;

        @Autowired
        JWTUtil jwtUtil;

        @Autowired
        UserRepository userRepository;

        @Autowired
        BCryptPasswordEncoder bCryptPasswordEncoder;

        public String signUp(User user) {
            if (userRepository.findByUsername(user.getUsername()).isEmpty()) {
                user.setActive(true);
                user.setRole("USER");
                user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
                userRepository.save(user);
                return jwtUtil.generateToken(user.getUsername());
            } else {
                throw new UsersAlreadyExistsException("Invalid username/password supplied");
            }
        }

        public List<User> getAllUser() {
            return new ArrayList<>(userRepository.findAll());
        }

        @Override
        public String signIn(AuthCredentials authCredentials) throws Exception {
            try {
                authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authCredentials.getUsername(),
                        authCredentials.getPassword()));
                return jwtUtil.generateToken(authCredentials.getUsername());
            } catch (BadCredentialsException e) {
                throw new InvalidUserNameException("Invalid user name or password");
            }

        }
    }
