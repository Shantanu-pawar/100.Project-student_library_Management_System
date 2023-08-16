package com.Student_Library_Management.ServiceLayer;


import com.Student_Library_Management.Models.Author;
import com.Student_Library_Management.ReposatoryLayer.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public String addAuthor(Author author){

        // when book is created with this same author name only then  our List <Books> booksWritten will be updated
         authorRepository.save(author);
        return "Author Added successfully.";
    }
}
