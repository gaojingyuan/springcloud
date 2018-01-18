package com.gao.sleuthzipkinb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class SleuthzipkinbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SleuthzipkinbApplication.class, args);
	}

	@RequestMapping("/hi")
	public String home(){
		return "hi i'm miya!";
	}

	@RequestMapping("/miya")
	public String info(){
		return restTemplate.getForObject("http://localhost:8021/info",String.class);
	}

	@Autowired
	private RestTemplate restTemplate;

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

}
