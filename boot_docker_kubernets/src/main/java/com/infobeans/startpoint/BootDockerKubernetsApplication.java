package com.infobeans.startpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BootDockerKubernetsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootDockerKubernetsApplication.class, args);
	}

	@Bean
	public RestTemplate getTemplate() {
		return new  RestTemplate();
	}
}
