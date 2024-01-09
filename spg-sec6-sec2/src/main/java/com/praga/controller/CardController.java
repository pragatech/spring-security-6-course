package com.praga.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {
    @GetMapping("/myCard")
    public String getCardDetails(){
        return "Here are loans from DB";
    }
}
