package com.example.addroomssolution.repositories;

import com.example.addroomssolution.models.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(long userId);

    User save(User user);
}
