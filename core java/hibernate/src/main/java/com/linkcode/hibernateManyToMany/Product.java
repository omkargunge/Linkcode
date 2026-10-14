package com.linkcode.hibernateManyToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
	
	@Id
	private int pid;
	private String pname;
	private int qn;
	private double price;
	
	@ManyToMany(mappedBy = "product")
	private List<Customer> customer;

}
