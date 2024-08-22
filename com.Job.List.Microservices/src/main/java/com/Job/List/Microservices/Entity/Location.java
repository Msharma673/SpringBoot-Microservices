package com.Job.List.Microservices.Entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Location {

	private Long locationid;
	
	private String name;
	
	private String fathername;
	
	private String companyname;
	
	private String country;
	
	private String state;
	
	private String city;


	

}
