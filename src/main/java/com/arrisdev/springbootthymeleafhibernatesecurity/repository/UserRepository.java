package com.arrisdev.springbootthymeleafhibernatesecurity.repository;

import com.arrisdev.springbootthymeleafhibernatesecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
