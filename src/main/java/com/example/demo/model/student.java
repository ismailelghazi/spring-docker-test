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
    private String Id;
    private String Name;
    private String Lastname;
    @Indexed(unique = true)
    private String email;
    private Address address;
    private Gender gender;

    public student(String name, String lastname, String Email, Address address, Gender gender) {
        Name = name;
        Lastname = lastname;
        email = Email;
        this.address = address;
        this.gender = gender;
    }



}
