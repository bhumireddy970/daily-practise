package org.example.springsecurity.service;

import org.example.springsecurity.model.Users;
import org.example.springsecurity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo  userRepo;

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);

    public Users regiter( Users user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepo.save(user);
    }

    public List<Users> findAllUser() {
        return userRepo.findAll();
    }
}
