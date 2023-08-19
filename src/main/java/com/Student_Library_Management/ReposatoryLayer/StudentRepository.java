package com.Student_Library_Management.ReposatoryLayer;

import com.Student_Library_Management.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

        // not able to use this function what's the issue
        Student findByEmail(String email);

        List<Student> findByCountry(String country);

}
