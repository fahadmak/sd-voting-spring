package edu.miu.vote.services;

import edu.miu.vote.domain.AuthCredentials;
import edu.miu.vote.domain.User;

import java.util.List;

public interface UserService {
    public String signUp(User user);

    public List<User> getAllUser();

    public String signIn(AuthCredentials authCredentials) throws Exception;
}
