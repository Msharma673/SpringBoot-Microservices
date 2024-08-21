package com.Job.List.Microservices.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Job.List.Microservices.Entity.Company;
import com.Job.List.Microservices.Repository.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService{
	
	@Autowired
	private CompanyRepository companyrepo;

	@Override
	public Company create(Company company) {
		
		return companyrepo.save(company);
	}

	@Override
	public List<Company> getAll() {
		
		return companyrepo.findAll();
	}

	@Override
	public Optional<Company> get(Long id) {
		// TODO Auto-generated method stub
		return companyrepo.findById(id);
	}

}
