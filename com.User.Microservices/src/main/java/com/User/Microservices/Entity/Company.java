package com.User.Microservices.Entity;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter
public class Company {
	

	private Long id;
	
	private String name;
	
	private String fatherName;
	
	private String companyName;
	
	private String designation;
	
	private String toatalTime;
	
	
	List<Location> location=new ArrayList<>();


	public Company(Long id, String name, String fatherName, String companyName, String designation, String toatalTime,
			List<Location> location) {
		super();
		this.id = id;
		this.name = name;
		this.fatherName = fatherName;
		this.companyName = companyName;
		this.designation = designation;
		this.toatalTime = toatalTime;
		this.location = location;
	}


	public Company(Long id, String name, String fatherName, String companyName, String designation, String toatalTime) {
		super();
		this.id = id;
		this.name = name;
		this.fatherName = fatherName;
		this.companyName = companyName;
		this.designation = designation;
		this.toatalTime = toatalTime;
	}

	
	
	
}
