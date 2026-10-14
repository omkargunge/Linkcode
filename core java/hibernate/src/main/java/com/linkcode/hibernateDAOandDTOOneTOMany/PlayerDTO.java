package com.linkcode.hibernateDAOandDTOOneTOMany;


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


public class PlayerDTO {

	@Id
	
	private int jerseyNo;
	private String name;
	private boolean isCaptain;
	private String role;
	//player cha table tayr hoil tyat-jerseyno,name,iscaption,role
	
	//@ManyToOne
	//private TeamDTO team;
}
