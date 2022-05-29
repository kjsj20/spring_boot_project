package com.jskim.project.controller.v1;

import com.jskim.project.domain.Users;
import com.jskim.project.repository.UserRepository;
import com.jskim.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/v1")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    UserRepository userRepository;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<Users> list() {
        List<Users> users = userService.findUsers();
        return users;
    }

    @GetMapping("/user")
//    public Optional<Users> findUserById(@RequestParam Long id) {
    public Optional<Users> findUserById(@RequestParam Long id) {
        Optional<Users> user = userService.findUserById(id);
        System.out.println("user = " + user);
        return user;
//        return userService.findUserById(id);
    }

    @PostMapping("/user")
    public Users create(@RequestBody Users users) {
        Users newUser = userService.join(users);

        return users;
//        return userService.join(users);
    }

    @DeleteMapping("/user")
    public Long delete(@RequestParam Long id) {
        return userService.removeUserById(id);
    }

//    @PutMapping("/user")
//    public Users update(@RequestBody Users users) {
//        return userService.modifyUserById(users);
//    }
}