package com.linkcode.hibernateDAOandDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="books")


	public class BookDTO {

		
		@Id
	    private int bookid;
	    @Column(name = "bookname")
	    private String bname;
	    @Column(name = "bookAuthor")
	    private String author;
	    private double price;
	    
	}

	  

