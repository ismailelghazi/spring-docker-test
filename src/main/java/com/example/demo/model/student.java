package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Data
@Document
public class student {
    @Id
    private String id;
    private String name;
    private String lastName;
    @Indexed(unique = true)
    private String email;
    private Address address;
    private Gender gender;

    public student(String name, String lastName, String email, Address address, Gender gender) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.gender = gender;
    }
}
