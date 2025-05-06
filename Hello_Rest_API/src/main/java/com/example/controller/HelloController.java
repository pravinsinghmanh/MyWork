package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first_project")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println("Hello");
        return "Hello";
    }

    @PostMapping("/hello")
    public String hello(String name){
        System.out.println("Hello"+name);
        return "Hello"+name;
    }
}
