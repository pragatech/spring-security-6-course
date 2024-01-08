package com.praga.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class WelcomeController {

    @GetMapping("/welcome")
    public String sayWelcome(){
        return "Welcome to Spring boot without security";
    }
}
