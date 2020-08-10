package com.innominds.jenkins.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.*;

import com.innominds.jenkins.models.Model;

@RestController
@RequestMapping(value = "/hello")
public class JenkinsController {

    private static final String TEMPLATE = "Hello Springboot, %s!";
    private final AtomicLong COUNTER = new AtomicLong();

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public Model getHello(
            @PathVariable String name) {
        // Instantiate the next Hello
        Model hello = new Model(COUNTER.incrementAndGet(), String.format(TEMPLATE, name));
        // Return the next Hello
        return hello;
    }
}
