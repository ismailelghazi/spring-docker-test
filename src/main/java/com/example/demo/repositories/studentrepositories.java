package com.example.demo.repositories;

import com.example.demo.model.student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface studentrepositories extends MongoRepository<student,String> {
}
