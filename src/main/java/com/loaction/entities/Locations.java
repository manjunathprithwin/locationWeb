package com.loaction.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Entity

@Table(name= "Location")
public class Locations {
	
	@Id
	private long id;
	
	@Column(name="code")
	private String codes;
	
	
	private String name;
	

	private String type;

	//here i added a comment
	

}
