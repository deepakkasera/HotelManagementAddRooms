package com.example.addroomsstarter.repositories;

import com.example.addroomsstarter.models.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(long userId);

    User save(User user);
}
