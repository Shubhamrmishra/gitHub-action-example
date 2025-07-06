package com.shubham.demo_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoAppApplication {

	@GetMapping("/welcome")
	public String welcomeMessage(){
		return "welcome to GHA";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoAppApplication.class, args);
	}


}
