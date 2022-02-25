package com.ayushtiwari.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdTestApplication {
//		git init
//		git add README.md
//		git commit -m "first commit"
//		git branch -M main
//		git remote add origin https://github.com/kingannuj/github-actions-test.git


	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to my First cicd Project";
	}
	public static void main(String[] args) {
		SpringApplication.run(GithubCicdTestApplication.class, args);
	}

}
