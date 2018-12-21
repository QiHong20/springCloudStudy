package com.qihong.demowebflux.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello2")
    public String handle(){
        return "hello2";
    }
}
