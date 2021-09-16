package com.example.dockerproj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerHelloWorldController {

	@RequestMapping("/hello")  
	public String dockerHello()
	{  
		return "Hello Jafar from Docker container";  
	}
}
