package com.springboot.demo.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {

    @GetMapping("/")

    public String sayHello()
    {
        return "Hello World!";
    }

    @GetMapping("/Workout")

    public String WorkoutHello()
    {
        return "Hello World from Workout";
    }
}
