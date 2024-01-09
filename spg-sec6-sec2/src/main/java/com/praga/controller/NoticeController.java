package com.praga.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class NoticeController {

    @GetMapping("/notices")
    public String getNotices(){
        return "Here are notices from DB";
    }
}
