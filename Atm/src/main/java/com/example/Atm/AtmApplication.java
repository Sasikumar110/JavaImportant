package com.example.Atm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableAutoConfiguration
@AutoConfiguration
public class AtmApplication {

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(AtmApplication.class, args);
	}

}
