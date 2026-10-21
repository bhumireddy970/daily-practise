package org.example.springsecurity.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.springsecurity.model.Users;
import org.example.springsecurity.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    Users user1 = new Users();

    @BeforeEach
    void setUp() {
        user1.setUserName("saradhi");
        this.mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
    }

    @Test
    void testRegisterUser() throws Exception {

        user1.setPassword("password123");

        Users savedUser = new Users();
        savedUser.setUserName("saradhi");
        savedUser.setPassword("encoded-password");

        when(userService.regiter(any(Users.class))).thenReturn(savedUser);

        mockMvc.perform(post("/register")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(user1)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.userName").value("saradhi"))
                .andExpect(jsonPath("$.password").value("encoded-password"));

        verify(userService, times(1)).regiter(any(Users.class));
    }

    @Test
    void testGetAllUsers() throws Exception {
        user1.setPassword("encoded-password");

        Users user2 = new Users();
        user2.setUserName("ravi");
        user2.setPassword("encoded-password");

        when(userService.findAllUser()).thenReturn(List.of(user1, user2));

        mockMvc.perform(get("/users"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(2))
                .andExpect(jsonPath("$[0].userName").value("saradhi"))
                .andExpect(jsonPath("$[1].userName").value("ravi"));

        verify(userService, times(1)).findAllUser();
    }

    @Test
    void testLoginSuccess() throws Exception {

        user1.setPassword("password123");

        when(userService.verify(any(Users.class))).thenReturn("mock-jwt-token");

        mockMvc.perform(post("/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(user1)))
                .andExpect(status().isOk())
                .andExpect(content().string("mock-jwt-token"));

        verify(userService, times(1)).verify(any(Users.class));
    }

    @Test
    void testLoginFailure() throws Exception {
        user1.setPassword("wrong-password");

        when(userService.verify(any(Users.class))).thenReturn("failure");

        mockMvc.perform(post("/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(user1)))
                .andExpect(status().isOk())
                .andExpect(content().string("failure"));

        verify(userService, times(1)).verify(any(Users.class));
    }
}
