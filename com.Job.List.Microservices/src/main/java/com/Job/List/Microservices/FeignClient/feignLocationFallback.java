package com.Job.List.Microservices.FeignClient;



import org.springframework.stereotype.Component;

import com.Job.List.Microservices.Entity.Location;

@Component
public class feignLocationFallback implements feignLocation {

    @Override
    public Location getLocationById(Long locationId) {
        // Return a default Location object or handle the error accordingly
        Location fallbackLocation = new Location();
        fallbackLocation.setLocationid(locationId);
        fallbackLocation.setName("Default Location");
        return fallbackLocation;
    }
}

