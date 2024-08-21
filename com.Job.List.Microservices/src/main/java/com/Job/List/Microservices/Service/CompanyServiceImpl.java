package com.Job.List.Microservices.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Job.List.Microservices.Entity.Company;
import com.Job.List.Microservices.Entity.Location;
import com.Job.List.Microservices.FeignClient.feignLocation;
import com.Job.List.Microservices.Repository.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService{
	
	@Autowired
	private CompanyRepository companyrepo;
	
	@Autowired
	private feignLocation feign;
	

	@Override
	public Company create(Company company) {
		
		return companyrepo.save(company);
	}

	@Override
	public List<Company> getAll() {
		
		return companyrepo.findAll();
	}

	@Override
	public Company get(Long id) {
		// TODO Auto-generated method stub
		Company cmpny = companyrepo.companyById(id);
		
		
		List<Location> location = feign.allLocationlist();
		cmpny.setLocation(location);
		
		return cmpny;
	}
	
	

}
