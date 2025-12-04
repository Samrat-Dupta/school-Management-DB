package com.jpahibernate.example.school_management_DB.controller;

import com.jpahibernate.example.school_management_DB.model.Student;
import com.jpahibernate.example.school_management_DB.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student/api")
public class StudentController {

    // flow : controller<->service<->repository

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public String addStudent(@RequestBody Student student){
        String response = studentService.saveStudent(student);
        return response;
    }
    @PostMapping("/saveMany")
    public String addStudents(@RequestBody List<Student> studentList){
        String response = studentService.saveStudents(studentList);
        return response;
    }
    @GetMapping("/findAll")
    public List<Student> findAllStudent(){
        List<Student> studentList  = studentService.getAllStudents();
        return studentList;
    }
}
