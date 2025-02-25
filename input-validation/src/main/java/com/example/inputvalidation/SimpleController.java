package com.example.inputvalidation;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@RestController
@RequestMapping("/api")
public class SimpleController {
    @GetMapping("/hello")
    public String sayHello(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/age")
    public String validateAge(@RequestParam @Min(18) int age) {
        return "Your age is valid: " + age;
    }

    @PostMapping("/user")
    public User createUser(@Valid @RequestBody User user) {
        return user;
    }
}