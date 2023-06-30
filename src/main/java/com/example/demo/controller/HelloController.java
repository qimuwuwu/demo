package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloController {
    @GetMapping("/sayHello")
    public String sayHello() {
        return "hello" + LocalDateTime.now();
    }

}
