package com.User.Microservices.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.User.Microservices.Entity.Company;

//@FeignClient(name = "JOB-LIST-MICROSERVISES")
//public interface FeignService {
//	
//	
//	
////	@GetMapping("/location/get-location-id/{id}")
////	Location locationbyId(@PathVariable("id") Long id);
////	
//	@GetMapping("/company/get-company-id/{id}")
//	Company getCompanyById(@PathVariable ("id") Long companyId);
//	
//
//}


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "JOB-LIST-MICROSERVISES", fallback = FeignServiceFallback.class)
public interface FeignService {

    @GetMapping("/company/get-company-id/{id}")
    Company getCompanyById(@PathVariable("id") Long companyId);

    // Uncomment this if needed
    // @GetMapping("/location/get-location-id/{id}")
    // Location locationbyId(@PathVariable("id") Long id);
}
