package com.jskim.project.repository;

import com.jskim.project.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//public interface UserRepository {
//    Users save(Users users);
//    Long remove(Long id);
//    Users update(Users users);
//    Optional<Users> findById(Long id);
//    Optional<Users> findByName(String name);
//    List<Users> findAll();
//}

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
}
