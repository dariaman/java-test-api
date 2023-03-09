package com.testapi.api3.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testapi.api3.testobject.Greeting;

@RestController
public class HelloworldController {

    Greeting greeting;
    AtomicLong counter = new AtomicLong();

    @GetMapping("/hello")
    public Greeting HelloWorld() {
        greeting = new Greeting();
        greeting.setId(counter.getAndIncrement());
        greeting.setContent("Hallo Guys");
        return greeting;
    }
}
