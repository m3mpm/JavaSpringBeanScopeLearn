package com.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/")
    public String loginGet(){
        return "login";
    }

    @PostMapping("/")
    public String loginPost(@RequestParam String username, @RequestParam String password, Model page){
        boolean loggedIn = false;

        if (loggedIn) {
            page.addAttribute("mesasge", "You're now logged in.");
        } else {
            page.addAttribute("message", "Login failed!");
        }


        return "login";
    }
}
