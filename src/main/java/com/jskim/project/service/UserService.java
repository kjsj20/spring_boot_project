package com.jskim.project.service;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jskim.project.domain.User;
import com.jskim.project.repository.UserRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Transactional
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findUsers() {
        return userRepository.findAll();
    }

    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }

    public User join(User user) {
        validateDuplicateUser(user);
        userRepository.save(user);
        return user;
    }

    private void validateDuplicateUser(User user) {
        userRepository.findByName(user.getName())
                .ifPresent(u -> {
                    throw new IllegalStateException("you are already a user");
                });
    }

    // 회원 가입 유효성 검사
    public void validateHandling(Errors errors) {
//        Map<String, String> validatorResult = new HashMap<>();
//
//        for (FieldError error : errors.getFieldErrors()) {
//            String validKeyName = String.format("valid_%s", error.getField());
//            validatorResult.put(validKeyName, error.getDefaultMessage());
//        }
//
//        return validatorResult;
    }
}
