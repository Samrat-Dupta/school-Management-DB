package com.jpahibernate.example.school_management_DB.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //it regers that it is a model/entity class
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id //it is a primary key and cannot have duplicate values
    @Column(name = "studentId", nullable = false) //it will create the table inside the database with the name of studentId
    private int studentId;

    @Column(name = "name", nullable = false) //nullable = false - it is mandatory to give the values and it cannot have the null value
    private String name;

    @Column(name = "dob", nullable = false)
    private String dob;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "grade", nullable = false)
    private String grade;

    @Column(name = "section", nullable = false)
    private String section;
}
