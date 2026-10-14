package com.linkcode.hibernateOneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverDTO {

	@Id
	private int id;
	private String name;
	private String location;
	private int age;
	
}
