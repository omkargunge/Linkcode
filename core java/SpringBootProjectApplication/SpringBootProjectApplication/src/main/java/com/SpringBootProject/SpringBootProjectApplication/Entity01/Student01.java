package com.SpringBootProject.SpringBootProjectApplication.Entity01;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student01 {

	@Id
	private int id;
	private String name;
	private double marks;
}
