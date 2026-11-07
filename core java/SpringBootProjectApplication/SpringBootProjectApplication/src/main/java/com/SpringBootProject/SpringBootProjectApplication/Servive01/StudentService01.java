package com.SpringBootProject.SpringBootProjectApplication.Servive01;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.SpringBootProject.SpringBootProjectApplication.Entity01.Student01;
import com.SpringBootProject.SpringBootProjectApplication.Repository01.StudentRepository01;

@Service
public class StudentService01 {

    @Autowired
    private StudentRepository01 repository;

    public void addStudent01(Student01 student) {
        repository.save(student);
    }

    public void updateStudent01(Student01 student) {
        repository.save(student);
    }

    public Optional<Student01> searchstudent(int id) {
        return repository.findById(id);
    }

    public List<Student01> findAll() {
        List<Student01> students = new ArrayList<Student01>();
        repository.findAll().forEach(val -> students.add(val));
        return students;
    }
    public void deleteStudent01(int id) {
        repository.deleteById(id);
    }
    public Optional<Student01> searchStudent01(int id) {
        return repository.findById(id);
    }
}
