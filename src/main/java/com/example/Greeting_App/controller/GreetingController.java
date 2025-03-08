package com.example.Greeting_App.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping("/hello")
    public String sayHello() {
        return "{ \"message\": \"Hello from BridgeLabz\" }";
    }
}
