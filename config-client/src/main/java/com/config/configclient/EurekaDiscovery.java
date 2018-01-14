package com.config.configclient;


import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaDiscovery {

    @Autowired
    private DiscoveryClient Sherlock;


    @RequestMapping("/discovery")
    public String serviceList(){
        return Sherlock.getServices().toString();
    }

}
