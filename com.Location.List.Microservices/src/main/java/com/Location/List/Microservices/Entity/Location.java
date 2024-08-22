package com.Location.List.Microservices.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Builder
public class Location {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="locationid")
	private Long locationid;
	@Column(name="name")
	private String name;
	@Column(name="fathername")
	private String fathername;
	@Column(name="companyname")
	private String companyname;
	@Column(name="country")
	private String country;
	@Column(name="state")
	private String state;
	@Column(name="city")
	private String city;

	
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}


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
	
	
	

}
