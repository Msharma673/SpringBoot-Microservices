package com.Location.List.Microservices.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Location.List.Microservices.Entity.Location;
import com.Location.List.Microservices.Repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService{
	
	@Autowired
	private LocationRepository locationRepo;
	

	@Override
	public Location create(Location location) {
		
		return locationRepo.save(location);
	}

	@Override
	public List<Location> getAllLocation() {
		
		
		return locationRepo.findAll();
	}

	@Override
	public Optional<Location> getById(Long id) {
		Optional<Location> location= locationRepo.findById(id);
		return location;
	}

}
