package com.Location.List.Microservices.Service;

import java.util.List;
import java.util.Optional;

import com.Location.List.Microservices.Entity.Location;

public interface LocationService {

	// create

	public Location create(Location location);

	// get all
	public List<Location> getAllLocation();

	// get single
	public Optional<Location> getById(Long id);

}
