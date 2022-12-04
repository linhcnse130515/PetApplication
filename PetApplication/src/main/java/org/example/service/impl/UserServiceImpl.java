package org.example.service.impl;

import org.example.controllers.UserController;
import org.example.dto.CreateUserRequest;
import org.example.entity.User;
import org.example.repositories.UserRepository;
import org.example.security.CustomUserDetails;
import org.example.security.JwtTokenProvider;
import org.example.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Transactional
    public User save(CreateUserRequest createUserRequest) {
        User user = new User();
        user.setUsername(createUserRequest.getUsername());
        if (createUserRequest.getPassword().length() < 7 ||
                !createUserRequest.getPassword().equals(createUserRequest.getConfirmPassword())) {
            log.error("Password need to longer than 7 characters and equals to confirmPassword");
            return null;
        }
        user.setPassword(createUserRequest.getPassword());
        CustomUserDetails userDetails = new CustomUserDetails(user.getId(), user.getUsername(), user.getPassword());
        String token = jwtTokenProvider.generateToken(userDetails);
        user.setToken(token);
        userRepository.save(user);
        return user;
    }
}
