package com.Student_Library_Management.ReposatoryLayer;

import com.Student_Library_Management.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository <Card, Integer> {


}
