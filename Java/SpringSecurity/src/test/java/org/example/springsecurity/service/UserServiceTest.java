package org.example.springsecurity.service;

import org.example.springsecurity.model.Users;
import org.example.springsecurity.repo.UserRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepo userRepo;

    @Mock
    private AuthenticationManager authenticationManager;

    @Mock
    private JWTService jwtService;

    @Mock
    private Authentication authentication;

    @InjectMocks
    private UserService userService;

    private Users user;
    private BCryptPasswordEncoder passwordEncoder;

    @BeforeEach
    void setUp() {
        user = new Users();
        user.setUserName("saradhi");
        user.setPassword("sara@123");
        passwordEncoder = new BCryptPasswordEncoder(12);
    }

    @Test
    void testRegisterUser() {
        when(userRepo.save(any(Users.class)))
                .thenAnswer(invocation -> invocation.getArgument(0));

        Users savedUser = userService.regiter(user);

        assertNotNull(savedUser);
        assertEquals("saradhi", savedUser.getUserName());
        assertNotEquals("sara@123", savedUser.getPassword());
        assertTrue(passwordEncoder.matches("sara@123", savedUser.getPassword()));

        verify(userRepo, times(1)).save(user);
    }

    @Test
    void testFindAllUser() {
        Users user1 = new Users();
        user1.setUserName("saradhi");

        Users user2 = new Users();
        user2.setUserName("ravi");

        when(userRepo.findAll()).thenReturn(List.of(user1, user2));

        List<Users> users = userService.findAllUser();

        assertNotNull(users);
        assertEquals(2, users.size());
        assertEquals("saradhi", users.get(0).getUserName());
        assertEquals("ravi", users.get(1).getUserName());

        verify(userRepo, times(1)).findAll();
    }

    @Test
    void testVerifySuccess() {
        when(authenticationManager.authenticate(any(UsernamePasswordAuthenticationToken.class)))
                .thenReturn(authentication);
        when(authentication.isAuthenticated()).thenReturn(true);
        when(jwtService.generateToken("saradhi")).thenReturn("mock-jwt-token");

        String token = userService.verify(user);

        assertEquals("mock-jwt-token", token);
        verify(authenticationManager, times(1)).authenticate(any(UsernamePasswordAuthenticationToken.class));
        verify(jwtService, times(1)).generateToken("saradhi");
    }

    @Test
    void testVerifyReturnsFailureWhenNotAuthenticated() {
        when(authenticationManager.authenticate(any(UsernamePasswordAuthenticationToken.class)))
                .thenReturn(authentication);
        when(authentication.isAuthenticated()).thenReturn(false);

        String result = userService.verify(user);

        assertEquals("failure", result);
        verify(jwtService, never()).generateToken(anyString());
    }

    @Test
    void testVerifyThrowsExceptionForInvalidCredentials() {
        when(authenticationManager.authenticate(any(UsernamePasswordAuthenticationToken.class)))
                .thenThrow(new org.springframework.security.authentication.BadCredentialsException("Invalid credentials"));

        assertThrows(AuthenticationException.class, () -> userService.verify(user));
        verify(jwtService, never()).generateToken(anyString());
    }
}
