package edu.miu.vote.services;

import edu.miu.vote.model.MyUserDetails;
import edu.miu.vote.model.User;
import edu.miu.vote.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface UserService {
    public void addUser(User user);
    public List<User> getAllUser();
}
