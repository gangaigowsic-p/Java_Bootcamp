package com.Student.student.controller;

import com.Student.student.stuapp.application;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class stuappController {
    @GetMapping("/stuapp")
    public ResponseEntity<application> stuapp() {
        application sobj = new application(1, "abdul", 18);
        return new ResponseEntity<>(sobj, HttpStatus.OK);
    }

    @GetMapping("/{id}/{name}/{age}")
    public ResponseEntity<application> setBankAccount(@PathVariable int id, @PathVariable String name, @PathVariable int age) {
        application sobj = new application(id, name, age);
        return new ResponseEntity<>(sobj, HttpStatus.OK);
    }

    @GetMapping("/quere")
    public ResponseEntity<application> quere() {
        application sobj = new application(1, "abdul", 18);
        return new ResponseEntity<>(sobj, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<application> create(@RequestBody application sobj) {
        System.out.println(sobj.getRollno() + " " + sobj.getName() + " " + sobj.getAge());
        return new ResponseEntity<>(sobj, HttpStatus.OK);
    }
}