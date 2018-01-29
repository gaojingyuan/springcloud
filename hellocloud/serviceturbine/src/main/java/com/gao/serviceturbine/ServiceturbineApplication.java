package com.gao.serviceturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class ServiceturbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceturbineApplication.class, args);
	}
}
