package com.jskim.project.repository;

import com.jskim.project.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaUserRepository extends JpaRepository<Users, Long>, UserRepository {

}
