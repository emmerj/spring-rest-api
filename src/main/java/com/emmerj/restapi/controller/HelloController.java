package com.emmerj.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public HelloController(){}

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World!";
    }
}
