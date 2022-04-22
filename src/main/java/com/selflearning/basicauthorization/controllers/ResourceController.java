package com.selflearning.basicauthorization.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping("/helloadmin")
    public String getHelloAdmin(){
        return "Hello Admin";
    }

    @GetMapping("/hellouser")
    public String getHelloUser(){
        return "Hello User";
    }
}
