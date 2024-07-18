package com.pdev.mybank.service;

import com.pdev.mybank.entity.User;
import com.pdev.mybank.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public Optional<User> findById(UUID id) {
        return repository.findById(id);
    }

    public User createUser(User user) {
        if( repository.existsByAccountNumber(user.getAccount().getNumber())) {
            throw new IllegalArgumentException("Account number already exists");
        }
        return repository.save(user);
    }
}
