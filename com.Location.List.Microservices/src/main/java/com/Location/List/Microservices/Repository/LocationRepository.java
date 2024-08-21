package com.Location.List.Microservices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Location.List.Microservices.Entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
	

}
