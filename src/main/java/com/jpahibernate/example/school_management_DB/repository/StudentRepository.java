package com.jpahibernate.example.school_management_DB.repository;

import com.jpahibernate.example.school_management_DB.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //it is data layer it performs database activities
public interface StudentRepository extends JpaRepository<Student, Integer> {


}
