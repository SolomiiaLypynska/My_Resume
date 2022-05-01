package com.myresume.discovery.MyResumeDiscoveryService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyResumeDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyResumeDiscoveryServiceApplication.class, args);
	}

}
