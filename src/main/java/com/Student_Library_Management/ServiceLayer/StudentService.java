package com.Student_Library_Management.ServiceLayer;

import com.Student_Library_Management.ENUMS.CardStatus;
import com.Student_Library_Management.Models.Card;
import com.Student_Library_Management.Models.Student;
import com.Student_Library_Management.ReposatoryLayer.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public String addStudent(Student student){
        // student from postman had already set the basic attributes


// Here card should be autoGenerated when addStudent function is called. that's why we're setting the attributes who are not autogenerated
        Card card = new Card();
        card.setCardStatus(CardStatus.ACTIVATED); // and set card status
        card.setStudent(student); // [This is foreign key attribute]

        // now we've to set the card whenever we save student.
        student.setCard(card);

        // now if we're saving student then card is also get automatically saved.
        studentRepository.save(student);

        return "student and card added successfully.";
    }

    public String findNameByEmail(String email){
        Student student = studentRepository.findByEmail(email);
        return student.getName();
    }

}
