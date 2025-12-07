package com.jpahibernate.example.school_management_DB.service;

import com.jpahibernate.example.school_management_DB.model.Student;
import com.jpahibernate.example.school_management_DB.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //it contains business logic
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String saveStudent(Student student){
        studentRepository.save(student);
        return "Student saved successfully";
    }

    public String saveStudents(List<Student> studentList){
        studentRepository.saveAll(studentList);
        return "Student saved successfully";
    }

    public List<Student> getAllStudents(){
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }

    public Student getStudentById(int studentId){
        Student student = studentRepository.findById(studentId).get();
        return student;
    }

    public String deleteStudentById(int studentId){
        studentRepository.deleteById(studentId);
        return "student with id : " +studentId+ " got deleted";
    }

    public String updateStudentWithPut(int studentId, Student newStudentRequest){
        //first find the studentId
        //if student present update it
        //else no need to update
        Student student = getStudentById(studentId);
        if(student!=null){
            studentRepository.save(newStudentRequest);
            return "Student updated successfully";
        } else {
            return "cannot find student with Id : "+studentId;
        }
    }

    public String updateStudentWithPatch(int studentId, String grade, String dob){

        Student student = getStudentById(studentId);
        if(student!=null){
            student.setGrade(grade);
            student.setDob(dob);
            studentRepository.save(student);
            return "Student updated successfully";
        } else {
            return "cannot find student with Id : "+studentId;
        }
    }

}
