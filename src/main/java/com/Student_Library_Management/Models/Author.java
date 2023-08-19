package com.Student_Library_Management.Models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.Mapping;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="author")

@Getter
@Setter
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int age;
    private String country;
    private String rating;

    @OneToMany(mappedBy = "author" , cascade = CascadeType.ALL)
    private List<Book> booksWritten = new ArrayList<>(); // we're taking the books count for perticular author

//    if it's one to one then we'll choose to write [private Book book;]

    public Author(){}

    public Author(int id, String name, int age, String country, String rating) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.country = country;
        this.rating = rating;
    }
}
