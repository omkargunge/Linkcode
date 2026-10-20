
package com.SpringBootProject.SpringBootProjectApplication.Servive01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootProject.SpringBootProjectApplication.Entity01.Student01;
import com.SpringBootProject.SpringBootProjectApplication.Repository01.StudentRepository01;

@Service
public class StudentService01 {

    @Autowired
    private StudentRepository01 repository;

    public Student01 addStudent01(Student01 student) {
        return repository.save(student);
    }
}
