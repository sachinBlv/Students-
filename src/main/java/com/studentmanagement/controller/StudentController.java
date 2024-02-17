package com.studentmanagement.controller;

import com.studentmanagement.model.Student;
import com.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")

public class StudentController {
    @Autowired
    private StudentService studentService;
@PostMapping("/addstd")
    public Student addStudent(@RequestBody Student std){
        return studentService.saveStudent(std);
    }

    @PutMapping("/updatestd")
    public Student updateStudent(@RequestBody Student std){
        return studentService.updateStudent(std);
    }
    @GetMapping
    public Optional<Student> getStudentById(@PathVariable long id){
    return studentService.getById(id);
    }


}
