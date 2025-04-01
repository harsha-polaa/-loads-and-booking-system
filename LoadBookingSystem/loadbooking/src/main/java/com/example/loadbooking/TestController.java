package com.example.loadbooking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")  // Access this URL at http://localhost:8080/test
public class TestController {

    @GetMapping
    public String hello() {
        return "Hello, Load Booking System!";
    }
}
