package com.cloudcomputing.eurekaserverhello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello/server")
public class HelloWorld {

    @GetMapping
    public String hello(){
        return "Hello World";
    }
}
