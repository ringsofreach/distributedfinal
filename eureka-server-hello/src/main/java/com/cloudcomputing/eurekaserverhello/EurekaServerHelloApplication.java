package com.cloudcomputing.eurekaserverhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaServerHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerHelloApplication.class, args);
	}
}
