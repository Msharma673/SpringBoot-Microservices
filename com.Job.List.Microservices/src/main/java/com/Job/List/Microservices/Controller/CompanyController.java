package com.Job.List.Microservices.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Job.List.Microservices.Entity.Company;

import com.Job.List.Microservices.Service.CompanyService;

@RestController
@CrossOrigin("*")
@RequestMapping("company")
public class CompanyController {
	
	@Autowired
	private CompanyService companyservice;
	
//	@Autowired
//	private feignLocation feign;
	
	
	
	
	@PostMapping("/create-company")
	public Company createLocation (@RequestBody Company cmpny) {
		
		return companyservice.create(cmpny);
	}
	
	
	 @GetMapping("/get-company-id/{id}")
		public Optional<Company> getCompanyById(@PathVariable("id") Long id){
		 
		 return companyservice.get(id);
			
			
			
		}


}
