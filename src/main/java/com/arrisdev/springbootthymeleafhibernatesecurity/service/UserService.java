package com.arrisdev.springbootthymeleafhibernatesecurity.service;

import com.arrisdev.springbootthymeleafhibernatesecurity.model.User;
import com.arrisdev.springbootthymeleafhibernatesecurity.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);
}
