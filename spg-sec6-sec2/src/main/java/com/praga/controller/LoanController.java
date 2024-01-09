package com.praga.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
    @GetMapping("/myLoan")
    public String getLoanDetails(){
        return "Here are loans from DB";
    }
}