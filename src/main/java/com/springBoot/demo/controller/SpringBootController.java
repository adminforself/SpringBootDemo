package com.springBoot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SpringBootController {
    @RequestMapping("/demo")
    public String HelloWord(){
        return "Hello World";
    }

    @RequestMapping("/demo1")
    public String HelloWord1(){
        return "tomcat:80端口访问HelloWord";
    }
}
