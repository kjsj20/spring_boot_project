package com.jskim.project;

import com.jskim.project.repository.UserRepository;
import com.jskim.project.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {
//    private DataSource dataSource;
//
//    public SpringConfig(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
//
//    @Bean
//    public UserService userService() {
//        return new UserService(userRepository());
//    }

    private final UserRepository userRepository;

    public SpringConfig(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    @Bean
//    public UserRepository userRepository() {
//        return new JdbcUserRepository(dataSource);
//    }

    @Bean
    public UserService userService() {
        return new UserService(userRepository);
    }
}
