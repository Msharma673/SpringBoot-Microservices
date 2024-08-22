package com.Job.List.Microservices.Service;

import java.util.List;
import java.util.Optional;

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
//	

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
	    Optional<Company> companyOptional = companyrepo.findById(id);

	    if (companyOptional.isPresent()) {
	        Company company = companyOptional.get();
	        try {
	            Location location = feign.getLocationById(company.getLocationId());
	            company.setLocation(location);
	            return Optional.of(company);
	        } catch (Exception e) {
	            // Handle Feign client errors
	            e.printStackTrace(); // Log the error or handle it as needed
	            // Possibly return Optional.empty() or handle the situation accordingly
	        }
	    }

	    return Optional.empty();
	}



}
