package com.SpringBootProject.SpringBootProjectApplication.Controller10;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootProject.SpringBootProjectApplication.Entity01.Student01;
import com.SpringBootProject.SpringBootProjectApplication.Servive01.StudentService01;

@RestController
@RequestMapping("/test")
public class SpringController01 {

    @Autowired
    private StudentService01 service;

    // Test API
    @GetMapping
    public String test() {
        return "Testing RESTful APIs";
    }

    // Insert student
    @PostMapping("/add")
    public String addStudent(@RequestBody Student01 student) {
        service.addStudent01(student);
        return "Data added successfully";
    }

    // Update student
    @PutMapping("/update")
    public String updateStudent(@RequestBody Student01 student) {
        service.updateStudent01(student);
        return "Data updated successfully";
    }

    // Search student by ID
    @GetMapping("/search/{id}")
    public Optional<Student01> searchStudent(@PathVariable("id") int id) {
        return service.searchStudent01(id);
    }

    // Find all students
    @GetMapping("/findall")
    public List<Student01> findAll() {
        return service.findAll();
    }

    // Delete student by ID
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") int id) {
        service.deleteStudent01(id);
        return "Data deleted successfully";
    }
}
