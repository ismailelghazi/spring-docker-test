package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Data
@Document
public class student {
    @Id
    private String Id;
    private String Name;
    private String Lastname;
    private String Email;
    private ArrayList<String> Hobby;
    private Address address;
    private Gender gender;

    public student(String name, String lastname, String email, ArrayList<String> hobby, Address address, Gender gender) {
        Name = name;
        Lastname = lastname;
        Email = email;
        Hobby = hobby;
        this.address = address;
        this.gender = gender;
    }
}
