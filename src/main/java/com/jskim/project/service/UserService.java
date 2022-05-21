package com.jskim.project.service;

import com.jskim.project.domain.User;
import com.jskim.project.repository.UserRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findUsers() {
        return userRepository.findAll();
    }
}
