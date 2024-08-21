package com.Location.List.Microservices.Controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Location.List.Microservices.Entity.Location;
import com.Location.List.Microservices.Repository.LocationRepository;
import com.Location.List.Microservices.Service.LocationService;

@RequestMapping("/location")
@CrossOrigin("*")
@RestController
public class LocationController {
	
	@Autowired
	private LocationService locationService ;
	
	@Autowired
	private LocationRepository locationrepo ;
	
	
	// create
	
	@PostMapping("/create-location")
	public Location createLocation (@RequestBody Location location) {
		
		return locationService.create(location);
	}
	
	
//	 // get by id
//	    @GetMapping("/get-location-id/{id}")
//	    public Optional<Location> getLocatioById(@PathVariable  Long id) {
//	        return locationService.get(id);
//	    }
//
//
//	    //get all
//	    
//	    @GetMapping("/location-get-all")
//	    public  List<Location> locationGetAll(){
//	        return locationService.getAll();
//	        
//	        
//	    }
		    
         //get all
	    
	    @GetMapping("/location-get-all")
		public ResponseEntity<?> getAllLocation(){
			
			return new ResponseEntity<> (locationService.getAllLocation(), HttpStatus.OK);
			
		}
	    

	    // get by id
	    @GetMapping("/get-location-id/{id}")
		public ResponseEntity<?> getLocationById(@PathVariable Long id){
			
			return new ResponseEntity<> (locationService.getById(id), HttpStatus.OK);
			
		}

}
