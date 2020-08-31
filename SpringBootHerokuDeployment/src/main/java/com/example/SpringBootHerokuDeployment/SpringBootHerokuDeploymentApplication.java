package com.example.SpringBootHerokuDeployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootHerokuDeploymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHerokuDeploymentApplication.class, args);
	}


@RestController
public class HelloHeroku{

	@GetMapping("/")
	String hello(){
		return "Hello Ons";
		}

	}
}