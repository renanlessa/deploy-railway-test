package com.pdev.mybank.repository;

import com.pdev.mybank.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    boolean existsByAccountNumber(String number);
}
