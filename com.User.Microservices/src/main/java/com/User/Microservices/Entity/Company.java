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
	
	private String fathername;
	
	private String companyname;
	
	private String designation;
	
	private String toataltime;
	
	
	List<Location> location=new ArrayList<>();

	

	public Company(Long id, String name, String fathername, String companyname, String designation, String toataltime,
			List<Location> location) {
		super();
		this.id = id;
		this.name = name;
		this.fathername = fathername;
		this.companyname = companyname;
		this.designation = designation;
		this.toataltime = toataltime;
		this.location = location;
	}



	public Company(Long id, String name, String fathername, String companyname, String designation, String toataltime) {
		super();
		this.id = id;
		this.name = name;
		this.fathername = fathername;
		this.companyname = companyname;
		this.designation = designation;
		this.toataltime = toataltime;
	}


	
	
	
}
