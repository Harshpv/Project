package com.santaSquare.project.controller;

import com.santaSquare.project.DTO.LoginRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {


    @PostMapping("/login")
    public String login(@RequestBody LoginRequestDto loginRequestDto) {

        return "logged in";
    }
}
