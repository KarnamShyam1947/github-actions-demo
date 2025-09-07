package com.shyam.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoContoller {
    
    @GetMapping("/")
    public Object sample() {
        return Map.of("name", "karnam shyam",
                      "email", "karnamshyam9009@gmail.com",
                      "running", "on ec2 self hosted");
    }

    @GetMapping("/welcome/{name}")
    public Object welcome(@PathVariable("name") String name) {
        return "Welcome, " + name;
    }

}
