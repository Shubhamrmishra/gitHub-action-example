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

	//echo "# gitHub-action-example" >> README.md
	//git init
	//git add README.md
	//git commit -m "first commit"
	//git branch -M main
	//git remote add origin git@github.com:Shubhamrmishra/gitHub-action-example.git
	//git push -u origin main
}
