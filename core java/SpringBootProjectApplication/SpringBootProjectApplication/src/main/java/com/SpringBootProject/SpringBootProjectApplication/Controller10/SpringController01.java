
package com.SpringBootProject.SpringBootProjectApplication.Controller10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootProject.SpringBootProjectApplication.Entity01.Student01;
import com.SpringBootProject.SpringBootProjectApplication.Servive01.StudentService01;

@RestController
@RequestMapping("/test")
public class SpringController01 {

    @Autowired
    private StudentService01 service;

    @GetMapping
    public String test() {
        return "testing RESTFUL APIS";
    }

    @PostMapping
    public Student01 addStudent(@RequestBody Student01 student) {
        return service.addStudent01(student);
    }
}

	//getmappping - backend -- frontend
	//postmapping -frontend -- backend
	//putmapping -ubdate
	//deletemapping-delete


