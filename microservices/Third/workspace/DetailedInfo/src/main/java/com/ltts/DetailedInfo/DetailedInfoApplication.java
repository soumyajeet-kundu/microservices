package com.ltts.DetailedInfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DetailedInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DetailedInfoApplication.class, args);
	}
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
