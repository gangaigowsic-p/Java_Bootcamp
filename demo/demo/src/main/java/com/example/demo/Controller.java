package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String display() {
        return "ALL ECE Students are present";
    }

    @GetMapping("/students")
    public String students() {
        return "ECE Student List";
    }
}