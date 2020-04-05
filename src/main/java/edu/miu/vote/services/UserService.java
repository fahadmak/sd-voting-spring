package edu.miu.vote.services;

import edu.miu.vote.domain.User;

import java.util.List;

public interface UserService {
    public void addUser(User user);
    public List<User> getAllUser();
}
