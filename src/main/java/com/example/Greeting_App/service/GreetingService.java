package com.example.Greeting_App.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getGreetingMessage() {
        return "{ \"message\": \"Hello from BridgeLabz\" }";
    }
}
