package com.Job.List.Microservices.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Job.List.Microservices.Entity.Location;

//@FeignClient(name= "LOCATION-LIST-MIOCROSERVICES, url="localhost:8084")
@FeignClient(name = "LOCATION-LIST-MICROSERVICES")
public interface feignLocation {
	
	
//	@GetMapping("/location/get-location-id/{id}")
//	Location locationbyId(@PathVariable("id") Long id);
//	
	@GetMapping("/location/get-location-id/{id}")
	Location getLocationById(@PathVariable ("id") Long locationId);
	
//	//@FeignClient(name="currency-exchange", url="localhost:8000")
//	@FeignClient(name="currency-exchange")
//	public interface CurrencyExchangeProxy {
//		
//		@GetMapping("/currency-exchange/from/{from}/to/{to}")
//		public CurrencyConversion retrieveExchangeValue(
//				@PathVariable String from,
//				@PathVariable String to);


	
}
