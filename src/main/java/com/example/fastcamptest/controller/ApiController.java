package com.example.fastcamptest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // REST API처리하는 Controller
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public String hello() {

        return "hello spring boot!";  //
    }
}
