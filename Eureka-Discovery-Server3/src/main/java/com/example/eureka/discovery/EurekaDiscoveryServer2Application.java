package com.example.eureka.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDiscoveryServer2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDiscoveryServer2Application.class, args);
	}

}
