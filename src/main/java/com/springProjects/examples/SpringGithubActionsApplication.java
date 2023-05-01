package com.springProjects.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringGithubActionsApplication {

	@GetMapping("/")
	public String welcome(){
		return "Welcome to the world of learning ! ";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringGithubActionsApplication.class, args);
	}

}
