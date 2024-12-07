package com.santaSquare.project.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public String login(String username, String password) {

        return "logged in";
    }
}
