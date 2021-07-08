package com.infobeans.startpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {
	@Autowired
	RestTemplate restTemplate;
	@RequestMapping("/")
	public String getData() {
		String response = (String) restTemplate.exchange("http://localhost:8080/", 
                HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}).getBody();
return "Hi..." +  response;
	}
}
