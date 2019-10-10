package com.swf.example.servicehi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi/{name}")
    public String hi(@PathVariable("name") String name) {
        return "Hello " + name + " i am from port:" + port;
    }
}
