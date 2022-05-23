package com.jskim.project.repository;

import com.jskim.project.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user);
    Long remove(Long id);
    User modify(User user);
    Optional<User> findById(Long id);
    Optional<User> findByName(String name);
    List<User> findAll();
}
