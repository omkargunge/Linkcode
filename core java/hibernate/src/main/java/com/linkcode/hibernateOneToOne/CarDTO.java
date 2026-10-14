package com.linkcode.hibernateOneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //table banvel
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CarDTO {

	@Id //primary key banvel
	private int cid;
	private String cname;
	private String color;
	private String engineType;
	
	@OneToOne
	private DriverDTO driver;
}
