package org.example.springsecurity.controller;

import org.example.springsecurity.model.Users;
import org.example.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService users;

    @PostMapping("/register")
    public Users registerUser(@RequestBody Users user) {
        return users.regiter(user);
    }

    @GetMapping("/users")
    public List<Users> getAllUser()
    {
        return users.findAllUser();
    }

}
