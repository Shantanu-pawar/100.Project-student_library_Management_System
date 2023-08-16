package com.Student_Library_Management.ReposatoryLayer;

import com.Student_Library_Management.Models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
