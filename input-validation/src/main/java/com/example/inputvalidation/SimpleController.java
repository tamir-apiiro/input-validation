package com.example.inputvalidation;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
    public User createUser(@Validated @RequestBody User user) {
        return user;
    }
}