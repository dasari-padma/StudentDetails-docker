package com.example.studentDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentDetailsDockerApplication {
	@GetMapping("/student")
	public String docker()
	{
		return "Welcome to Docker";
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentDetailsDockerApplication.class, args);
	}

}
