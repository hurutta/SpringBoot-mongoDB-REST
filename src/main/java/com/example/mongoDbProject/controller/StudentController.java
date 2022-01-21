package com.example.mongoDbProject.controller;

import java.util.List;

import com.example.mongoDbProject.model.Student;
import com.example.mongoDbProject.repo.StudentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{

    @Autowired
    public StudentRepo studentRepo;

    @GetMapping(value="/all")
    public List<Student> getAllStudents()
    {
        return studentRepo.findAll();
    }   
    @PostMapping(value = "/create")
    public String createStudent(@RequestBody Student student)
    {
        Student insertedStudent = studentRepo.insert(student);
        return "Student banano sofol, "+insertedStudent.getName();
    }    
}
