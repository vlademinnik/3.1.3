package com.example.myboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class LoginController {
    @GetMapping(value = "login")
    public String loginPage() {
        return "users/login";
    }
}
