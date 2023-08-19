package com.Student_Library_Management.Models;


import jakarta.persistence.*;
import org.springframework.context.annotation.EnableMBeanExport;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // for auto incrementing procedure.
    private int id;

    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private int age;

    private String mobileNo;

    private String country;


    // now just write bi-Directional mappings from card side - so it will make sure that if
    //particular student is deleted so their card also get deleted

    // here i've written name of the variable return in child Entity - foreign key attribute. [i.e. student in this case]
    @OneToOne(mappedBy = "student",  cascade = CascadeType.ALL)
    private Card card;


    public Student() {}

    public Student(int id, String name, String email, int age, String mobileNo, String country, Card card) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.mobileNo = mobileNo;
        this.country = country;
        this.card = card;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
