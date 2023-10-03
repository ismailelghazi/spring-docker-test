package com.example.demo;

import com.example.demo.model.Address;
import com.example.demo.model.Gender;
import com.example.demo.model.student;
import com.example.demo.repositories.studentrepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(studentrepositories repository, MongoTemplate mongoTemplate)
	{
		return args -> {
			String email = "ismail@gmail.com";

			Address address = new Address("QA674","dfrt","ssff");

			System.out.println("hello");
			student students = new student("ismail","el ghazi",email,address,Gender.Male);
			Query query = new Query();
			query.addCriteria(Criteria.where("email").is(email));
			List<student> liststudent =mongoTemplate.find(query,student.class);
			if (liststudent.size()>  1)
			{
				System.out.println("0000000000000000000000");

				throw new IllegalStateException("m3ad eh eh eh eh m3ad wa khona "+email);
			}
			if (liststudent.isEmpty())
			{
				System.out.println("sss");
				repository.insert(students);
				System.out.println("mr7ba bik a sat f had test "+students);
			}else {
				System.out.println("no "+students);
			}
			System.out.println(students);



		};
	}

}
