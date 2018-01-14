package com.cloudcomputing.eurekaserverhello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/rest/hello/server")
//public class HelloWorld {
//
//
//    @Value("${message:Default greeting}")
//    private String message;
//
//    public String getMessage(){
//        return message;
//    }
@RestController
@RequestMapping("/rest/hello/server")
public class HelloWorld {

    @Value("${message:Default greeting}")
    private String message;

    @GetMapping
    public String hello(){
        return message;
    }
}
