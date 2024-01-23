package com.notizplaner.dev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hallo")
    public String hellWord() {
        return "hello world";
    }
}
