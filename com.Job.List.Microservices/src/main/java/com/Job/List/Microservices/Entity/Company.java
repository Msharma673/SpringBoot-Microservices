package com.Job.List.Microservices.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name = "company")
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "companyid")
	private Long companyid;

	private Long locationid;
	
	public Long getLocationId() {
        return locationid;
    }

	private String name;

	private String fathername;

	private String companyname;

	private String designation;

	private String toataltime;

	@Transient
    private Location location;
//	
//	@OneToMany // Assuming this is a one-to-many relationship
//    //@JoinColumn(name = "id")  // You need to define a foreign key column in the Location table
//	 private List<Location> location = new ArrayList<>();

	

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

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


	

}
