package com.praga.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @GetMapping("/myContact")
    public String getNotices(){
        return "Here are notices from DB";
    }
}
