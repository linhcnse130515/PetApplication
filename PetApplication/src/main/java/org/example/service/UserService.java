package org.example.service;

import org.example.model.persistence.User;
import org.example.model.requests.CreateUserRequest;

public interface UserService {
    User save(CreateUserRequest createUserRequest);
}
