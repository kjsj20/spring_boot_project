package com.jskim.project.repository;

import com.jskim.project.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaUserRepository extends JpaRepository<Users, Long> {
}
