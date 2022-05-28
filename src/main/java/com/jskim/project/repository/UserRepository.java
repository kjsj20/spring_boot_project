package com.jskim.project.repository;

import com.jskim.project.domain.Users;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    Users save(Users users);
    Long remove(Long id);
    Users modify(Users users);
    Optional<Users> findById(Long id);
    Optional<Users> findByName(String name);
    List<Users> findAll();
}
