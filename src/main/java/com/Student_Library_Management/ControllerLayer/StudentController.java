package com.Student_Library_Management.ControllerLayer;


import com.Student_Library_Management.Models.Student;
import com.Student_Library_Management.ServiceLayer.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    // find student by id;
//    just define a function in repository and attach it here
    @GetMapping("/get")
    public String getStudent(@RequestParam("email") String email ){
        return studentService.findNameByEmail(email);
    }

}
