package com.myresume.api.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MyResumeApiUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyResumeApiUserApplication.class, args);
	}

}
