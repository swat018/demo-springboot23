package com.example.demospringboot23;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Period;

@RestController
public class HelloController {

    @Value("15m")
    private Period timeToFry;

    @GetMapping("/hello")
    public String hello() {
        return "chicken " + timeToFry;
    }
}
