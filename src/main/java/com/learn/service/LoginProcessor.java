package com.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@Service
@RequestScope
public class LoginProcessor {

    private String username;
    private String password;

    private final LoggedUserManagementService loggedUserManagementService;

    @Autowired
    public LoginProcessor(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    public boolean login(){
        String username = this.getUsername();
        String password = this.getPassword();
        boolean result;

        if ("m3mpm".equals(username) && "1234".equals(password)){
            result = true;
            loggedUserManagementService.setUsername(username);
        } else {
            result = false;
        }
        return result;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
