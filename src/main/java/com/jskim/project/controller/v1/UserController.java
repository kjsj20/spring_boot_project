package com.jskim.project.controller.v1;

import com.jskim.project.domain.User;
import com.jskim.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/v1")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> list() {
        List<User> users = userService.findUsers();
        return users;
    }

    @GetMapping("/user")
    public Optional<User> findUserById(@RequestParam Long id) {
        return userService.findUserById(id);
    }

    @PostMapping("/user/new")
    public User create(@RequestBody User user) {
        return userService.join(user);
    }
}