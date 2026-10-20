package com.SpringBootProject.SpringBootProjectApplication.Repository01;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootProject.SpringBootProjectApplication.Entity01.Student01;

@Repository
public interface StudentRepository01 extends CrudRepository<Student01, Integer>{

}
