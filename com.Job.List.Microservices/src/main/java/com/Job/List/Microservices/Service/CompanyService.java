package com.Job.List.Microservices.Service;

import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;

import com.Job.List.Microservices.Entity.Company;

public interface CompanyService {

	// create

	public Company create(Company company);

	// get all
	public List<Company> getAll();

//	// get single
//	Company get(Long id);

	public Optional<Company> get(Long id);

}
