package com.arrisdev.springbootthymeleafhibernatesecurity.controller;

import com.arrisdev.springbootthymeleafhibernatesecurity.service.UserService;
import com.arrisdev.springbootthymeleafhibernatesecurity.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    UserService userService;

    public UserRegistrationController(UserService userService){
        super();
        this.userService = userService;
    }

    //this method is to tell thymeleaf to get the user from here
    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto(){
        return new UserRegistrationDto();
    }

    //creating method handler for registration
    @GetMapping
    public String showRegistrationForm(){
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto dto){
        userService.save(dto);
        return "redirect:/registration?succes";
    }
}
