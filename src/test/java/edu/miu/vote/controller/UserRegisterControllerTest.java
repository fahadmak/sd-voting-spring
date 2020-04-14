package edu.miu.vote.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.miu.vote.domain.AuthCredentials;
import edu.miu.vote.domain.User;
import edu.miu.vote.services.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class UserRegisterControllerTest {
    @InjectMocks
    AuthenticationController authenticationController;

    @Mock
    UserService userService;

    @Autowired
    MockMvc mockMvc;

    @Test
    void registerVoter() throws Exception {
        User user = new User();
        user.setUsername("mofo");
        user.setPassword("mpp");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        Mockito.when(userService.signUp(any(User.class))).thenReturn("apples");
        this.mockMvc.perform(post("/users").contentType(MediaType.APPLICATION_JSON)
                .content(json)).andExpect(status().isCreated());
    }

    @Test
    void signin() throws Exception {
        AuthCredentials user = new AuthCredentials("mo","mpp");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        Mockito.when(userService.signIn(any(AuthCredentials.class))).thenReturn("apples");
        this.mockMvc.perform(post("/authenticate").contentType(MediaType.APPLICATION_JSON)
                .content(json)).andExpect(status().isOk());

    }
}