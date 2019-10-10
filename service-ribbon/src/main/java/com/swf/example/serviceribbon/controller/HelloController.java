package com.swf.example.serviceribbon.controller;

import com.swf.example.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shiwenfeng
 * @date 2019-10-06 23:10
 **/
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hi/{name}")
    public String hi(@PathVariable("name") String name){
        return helloService.hiService(name);
    }

}
