package com.example.demo_git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGitApplication.class, args);
	}

}

// Classe interne non publique
@RestController
class HelloWorldController {

	@GetMapping("/")
	public String sayHello() {
		return "Hello, World!";
	}
}
