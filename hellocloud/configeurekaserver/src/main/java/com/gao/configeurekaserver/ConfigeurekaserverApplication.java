package com.gao.configeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ConfigeurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigeurekaserverApplication.class, args);
	}
}
