package com.linkcode.hibernateDAOandDTOOneTOMany;

import java.util.List;
 

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TeamDTO {

	@Id //team id la primary key banval
	private int teamid;
	private String name;
	private String location;
	private String owner;
	
	@OneToMany //because one team aahe and many players aahe manun ethe takal,jithe many yeil tithe list ghene
	private List<PlayerDTO> player;
}
