package com.example.demo;

import com.example.demo.model.student;
import com.example.demo.repositories.studentrepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(studentrepositories repository)
	{
		return args -> {
			student student = new student("JJ","DDD","DDD","SSSS","SSSS");
		};
	};

}
