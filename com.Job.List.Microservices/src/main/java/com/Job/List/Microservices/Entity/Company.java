package com.Job.List.Microservices.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Builder
public class Company {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
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
