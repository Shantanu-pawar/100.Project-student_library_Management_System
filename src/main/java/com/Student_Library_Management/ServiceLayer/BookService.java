package com.Student_Library_Management.ServiceLayer;

import com.Student_Library_Management.Models.Author;
import com.Student_Library_Management.Models.Book;
import com.Student_Library_Management.ReposatoryLayer.AuthorRepository;
import com.Student_Library_Management.ReposatoryLayer.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;


    public String addBook(Book book){

// in this addBook i want to get authorEntity cause we want the author name with book - [so getting authorID here]
        int authorId = book.getAuthor().getId();
        Author author =  authorRepository.findById(authorId).get();

//     Practice : write exception handling here:
//        -------------

        // basic attribute's are already set
        // now here setting up foreign key attribute in child class
        book.setAuthor(author);

        List<Book> currentBookWritten = author.getBooksWritten(); // we've to update the list of books in parent class.
        currentBookWritten.add(book);
        author.setBooksWritten(currentBookWritten);

        authorRepository.save(author); // .save function works as update & save function
        return "Book added Successfully";

        //LOGIC : what we're doing here ?  -
        // first fetch the particular author name from our author list - [exception : if author not found then we've to register author first]
        // then in that list add the particular book with author
        // and now just return this list.

/*
this is the request in postman to add book [using author id] - used here author as object
{
    "bookName" : "Godan",
    "pages" : 61,
    "Genre" : "SELF_HELP",

        "author" : {
            "id" : 1
        }
}
 */
    }
}
