package com.obs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ObsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObsEurekaServerApplication.class, args);
	}

}
