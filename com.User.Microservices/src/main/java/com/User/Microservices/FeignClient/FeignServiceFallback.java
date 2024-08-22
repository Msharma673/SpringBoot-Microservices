package com.User.Microservices.FeignClient;

import org.springframework.stereotype.Component;

import com.User.Microservices.Entity.Company;

@Component
public class FeignServiceFallback implements FeignService {

    @Override
    public Company getCompanyById(Long companyId) {
        // Return a default Company object or handle the error accordingly
        Company fallbackCompany = new Company();
        fallbackCompany.setCompanyid(companyId);
        fallbackCompany.setName("Default Company");
        return fallbackCompany;
    }

    // If you uncomment and use the locationbyId method, you should implement its fallback here as well
    // @Override
    // public Location locationbyId(Long id) {
    //     Location fallbackLocation = new Location();
    //     fallbackLocation.setId(id);
    //     fallbackLocation.setName("Default Location");
    //     return fallbackLocation;
    // }
}
