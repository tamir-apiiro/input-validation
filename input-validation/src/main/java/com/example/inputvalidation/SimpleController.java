package com.example.inputvalidation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}