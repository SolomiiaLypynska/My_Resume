package com.myresume.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MyResumeConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyResumeConfigServerApplication.class, args);
	}

}
