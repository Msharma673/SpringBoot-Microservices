package com.User.Microservices.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Location {

	private Long locationid;
	
	private String name;
	
	private String fathername;
	
	private String companyname;
	
	private String country;
	
	private String state;
	
	private String city;

	public Location(Long locationid, String name, String fathername, String companyname, String country, String state,
			String city) {
		super();
		this.locationid = locationid;
		this.name = name;
		this.fathername = fathername;
		this.companyname = companyname;
		this.country = country;
		this.state = state;
		this.city = city;
	}

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	

}
