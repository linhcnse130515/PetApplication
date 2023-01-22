package org.example.service;

import org.example.entity.User;
import org.example.dto.CreateUserRequest;

public interface AuthenticationService {
    User create(CreateUserRequest createUserRequest);
}
