package com.User.Microservices.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Transient;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data

public class Company {
	


	private Long companyid;
	
	private Long locationid;
	
	private String name;
	
	private String fathername;
	
	private String companyname;
	
	private String designation;
	
	private String toataltime;
	
	@Transient
	private Location location;

	public Company(Long companyid, Long locationid, String name, String fathername, String companyname,
			String designation, String toataltime, Location location) {
		super();
		this.companyid = companyid;
		this.locationid = locationid;
		this.name = name;
		this.fathername = fathername;
		this.companyname = companyname;
		this.designation = designation;
		this.toataltime = toataltime;
		this.location = location;
	}

	public Company(Long companyid, Long locationid, String name, String fathername, String companyname,
			String designation, String toataltime) {
		super();
		this.companyid = companyid;
		this.locationid = locationid;
		this.name = name;
		this.fathername = fathername;
		this.companyname = companyname;
		this.designation = designation;
		this.toataltime = toataltime;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	



	
	
	
}
