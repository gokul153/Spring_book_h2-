package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello_controller {
    @GetMapping("/")
    public String hello(){
     return "hello_Spring_boot";
    }
}
