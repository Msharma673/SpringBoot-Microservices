package com.User.Microservices.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	private Long id;
	private String name;
	private String age;
	private String fatherName;
	List<Company> company = new ArrayList<>();

	public User(Long id, String name, String age, String fatherName, List<Company> company) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.fatherName = fatherName;
		this.company = company;
	}

	public User(Long id, String name, String age, String fatherName) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.fatherName = fatherName;
	}

}
