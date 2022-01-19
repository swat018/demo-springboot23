package com.example.demospringboot23;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.availability.ApplicationAvailability;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Period;

@RestController
public class HelloController {

    @Autowired
    ApplicationAvailability availability;

    @Autowired
    LocalHostService localHostService;

    @GetMapping("/hello")
    public String hello() {
        return "Application in now " + availability.getLivenessState()
                + " " + availability.getReadinessState()
                + " " + localHostService.getLocalHostInfo();
    }
}
