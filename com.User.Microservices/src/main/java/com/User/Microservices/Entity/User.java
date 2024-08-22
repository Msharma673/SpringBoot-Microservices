package com.User.Microservices.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Builder
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userid;
	private Long companyid;
	public Long getCompanyId() {
        return companyid;
    }
	private Long locationid;
	private String name;
	private String age;
	private String fatherName;
	
	@Transient
	private Company company;
	
	@Transient
	private Location location;

	public User(Long userid, Long companyid, Long locationid, String name, String age, String fatherName,
			Company company, Location location) {
		super();
		this.userid = userid;
		this.companyid = companyid;
		this.locationid = locationid;
		this.name = name;
		this.age = age;
		this.fatherName = fatherName;
		this.company = company;
		this.location = location;
	}

	public User(Long userid, Long companyid, Long locationid, String name, String age, String fatherName) {
		super();
		this.userid = userid;
		this.companyid = companyid;
		this.locationid = locationid;
		this.name = name;
		this.age = age;
		this.fatherName = fatherName;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
