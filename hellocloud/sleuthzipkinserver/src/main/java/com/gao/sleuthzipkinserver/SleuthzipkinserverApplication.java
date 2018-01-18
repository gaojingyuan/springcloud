package com.gao.sleuthzipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SleuthzipkinserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SleuthzipkinserverApplication.class, args);
	}
}
