package com.loaction.controller.dto;

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
@Table(name="location")
public class LocationsData {
	@Id
	@Column(name="id")
	private long id;
	
	private String codes;
	
	
	private String name;
	
	
	private String type;
	
	
	

}
