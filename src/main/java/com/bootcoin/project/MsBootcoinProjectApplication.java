package com.bootcoin.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsBootcoinProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsBootcoinProjectApplication.class, args);
	}

}
