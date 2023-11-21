package com.learn.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {

    private String username;
    private String password;

    public boolean login(){
        String username = this.getUsername();
        String password = this.getPassword();
        boolean result;

        if ("m3mpm".equals(username) && "password".equals(password)){
            result = true;
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
