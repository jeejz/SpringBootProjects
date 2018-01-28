package com.springboot.proj1.ProjectOne;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestRequest {
	
	@RequestMapping(name="/test")
	public String sayHello() {
		return "hello";
	}

}
