package com.klef.jfsd.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootMicroserviceProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceProjectApplication.class, args);
		System.out.println("Running Successfully...!!!");
	}
	
	//without creating object we cannot use resttemplate in our project
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}

}
