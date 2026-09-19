package com.app.bank.ecea.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
    @Value("${spring.application.name}")
    private  String appName;

    @GetMapping("/hello")
    public String hello()
    {
        return "helloworld";
    }

    @GetMapping("/app")
    public String getAppName()
    {
        return appName;
    }
}
