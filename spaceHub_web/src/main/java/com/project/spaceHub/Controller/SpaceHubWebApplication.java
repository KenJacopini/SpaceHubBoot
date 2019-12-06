package com.project.spaceHub.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"com.project.spaceHub.DTO", "com.project.spaceHub.repository"
})
public class SpaceHubWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpaceHubWebApplication.class, args);
	}

}
