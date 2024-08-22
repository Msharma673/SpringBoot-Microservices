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



//
//	@Override
//	public Company get(Long id, Long locationid) {
//	    // Retrieve the Company from the repository
//	    Company cmpny = companyrepo.companyById(id, locationid);
//
//	    // Retrieve all locations from the Feign client
//	    Location locationList = (Location) feign.LocationbyId(locationid);
//
//	    // Construct and return the Company object with the location list
//	    return new Company(
//	        cmpny.getId(),
//	        cmpny.getLocationid(),
//	        cmpny.getCompanyname(),
//	        cmpny.getFathername(),
//	        cmpny.getToataltime(),
//	        cmpny.getDesignation(),
//	        cmpny.getName(),
//	        locationList
//	    );
//	}
	
//	@Override
//    public Company get(Long id, Long locationid) {
//        // Retrieve the Company from the repository
//        Company cmpny = companyrepo.findById(id).orElse(null);
//
//        if (cmpny == null) {
//            return null; // Handle not found case
//        }
//
//        // Retrieve the Location from the Feign client
//        Location location = feign.LocationbyId(locationid);
//
//        // Assuming you might want to do something with the location here
//        // You can return Company along with Location data (if needed)
//        return cmpny; // Return Company without Location for now
//    }
//	
//	 @Override
//	    public Company get(Long id) {
//	        // Retrieve the Company from the repository
//	        Company cmpny = companyrepo.findById(id).orElse(null);
//
//	        if (cmpny == null) {
//	            return null; // Handle not found case
//	        }
//
//	        // Retrieve the Location from the Feign client
////	        Location location = feign.LocationbyId(cmpny.getLocationid());
//
//	        // Set the Location in the Company object
////	        cmpny.setLocation(location);
//
//	        return cmpny; // Return Company with Location included
//	    }

}
