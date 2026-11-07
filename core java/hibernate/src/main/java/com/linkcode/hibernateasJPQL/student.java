package com.linkcode.hibernateasJPQL;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity   //jya calss la ye anotatin dila jail to table banel
@Table(name="std")     //yat aapan table ch name chnage karu shakato
@Data  //for gatter and setteres 
public class student {

	@Id  //primary key banvel roll no la 
	@GeneratedValue(strategy = GenerationType.AUTO)  //roll no automatic generate hotata user kadun na ghene
	private int rollno;
	@Column(name="studentname",nullable = true)  //column chname change karanya sathi,nullable manje value nahi takali tari chalel
	private String name;
	private double marks;
}
