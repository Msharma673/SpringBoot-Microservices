package com.Job.List.Microservices.Service;

import java.util.List;
import java.util.Optional;

import com.Job.List.Microservices.Entity.Company;

public interface CompanyService {
	
	
	//create

    Company create(Company company);

    //get all
    List<Company> getAll();

    //get single
   Optional<Company> get(Long id);

	
	
}
