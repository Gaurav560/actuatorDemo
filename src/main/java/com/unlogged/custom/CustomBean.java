package com.unlogged.custom;

import org.springframework.stereotype.Component;

@Component
public class CustomBean {
    private String message;

    public CustomBean() {
        this.message = "Hello from CustomBean!";
    }

    public String getMessage() {
        return message;
    }
}