package com.jskim.project.service;

import com.jskim.project.domain.Users;
import com.jskim.project.repository.UserRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Errors;

import java.util.List;
import java.util.Optional;

@Transactional
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Users> findUsers() {
        return userRepository.findAll();
    }

    public Optional<Users> findUserById(Long id) {
        return userRepository.findById(id);
    }

    public Users join(Users users) {
//        validateDuplicateUser(users);
        userRepository.save(users);
        return users;
    }

//    private void validateDuplicateUser(Users users) {
//        userRepository.findOne(users)
//                .ifPresent(u -> {
//                    throw new IllegalStateException("you are already a user");
//                });
//    }

    public Long removeUserById(Long id) {
        userRepository.deleteById(id);
        return id;
    }

//    public Users modifyUserById(Users users) {
//        userRepository.update(users);
//        return users;
//    }
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
