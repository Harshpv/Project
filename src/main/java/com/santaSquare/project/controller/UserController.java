package com.santaSquare.project.controller;

import com.santaSquare.project.DTO.LoginRequestDto;
import com.santaSquare.project.DTO.RegisterUserDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    //register user
    @PostMapping("/newRegi")
    public String registerUser(@RequestBody RegisterUserDto registerUserDto) {
        return "registered";
    }



}
