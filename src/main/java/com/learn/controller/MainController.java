package com.learn.controller;

import com.learn.service.LoggedUserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private final LoggedUserManagementService  loggedUserManagementService;

    @Autowired
    public MainController(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    @GetMapping("/main")
    public String home(@RequestParam(required = false) String Logout, Model page){
        String result;
        if (Logout != null){
            loggedUserManagementService.setUsername(null);
        }

        String username = loggedUserManagementService.getUsername();

        if (username == null) {
            result = "redirect:/";
        } else {
            page.addAttribute("username", username);
            result = "main";
        }

        return result;
    }
}
