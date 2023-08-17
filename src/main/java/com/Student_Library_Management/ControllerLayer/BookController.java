package com.Student_Library_Management.ControllerLayer;

import com.Student_Library_Management.Models.Book;
import com.Student_Library_Management.ServiceLayer.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/add")
    public String addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }
}
