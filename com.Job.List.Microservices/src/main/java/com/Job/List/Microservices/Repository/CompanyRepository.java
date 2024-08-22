package com.Job.List.Microservices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Job.List.Microservices.Entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>{
	
	
	
	

}
