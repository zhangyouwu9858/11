package com.crnn.smart.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/static")
public class AuthController {

    @GetMapping("/user/info")
    public String getUserInfo(){
        return "admin";
    }
}
