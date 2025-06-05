package org.example.jpastudenf24b.controller;


import org.example.jpastudenf24b.model.Student;
import org.example.jpastudenf24b.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentRestController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/")
    public String detteErRoden() {
        return "Du er i roden af JPAStudent.";
    }

    @GetMapping("/students")
    public List<Student> students() {
        return studentRepository.findAll();
    }

    @PostMapping("/students")
    @ResponseStatus(HttpStatus.CREATED)
    public Student postStudent(@RequestBody Student student) {
        System.out.println("Indsætter ny student");
        System.out.println(student);
        return studentRepository.save(student);
    }

}
