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
}
