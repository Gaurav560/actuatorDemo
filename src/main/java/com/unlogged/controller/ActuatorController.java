package com.unlogged.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ActuatorController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello, Everyone! Happy Coding!";
    }
}
