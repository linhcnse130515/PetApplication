package org.example.controllers;

import org.example.dto.CreateUserRequest;
import org.example.entity.User;
import org.example.repositories.UserRepository;
import org.example.service.AuthenticationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authentication")
public class AuthenticationController {

    private static final Logger log = LoggerFactory.getLogger(AuthenticationController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("/id/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        return ResponseEntity.of(userRepository.findById(id));
    }

    @GetMapping("/login/{username}")
    public ResponseEntity<User> findByUserName(@PathVariable("username") String username) {
        User user = userRepository.findByUsername(username);
        return user == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(user);
    }

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody CreateUserRequest createUserRequest) {
        log.info("User name(" + createUserRequest.getUsername() + ") was successfully created");
        return ResponseEntity.ok(authenticationService.create(createUserRequest));
    }

}
