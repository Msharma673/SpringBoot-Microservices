package com.Job.List.Microservices.FeignClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.Job.List.Microservices.Entity.Location;


@FeignClient(name="location-list-microservices", url="localhost:8084")
public interface feignLocation {
	
	
	
	
//	//@FeignClient(name="currency-exchange", url="localhost:8000")
//	@FeignClient(name="currency-exchange")
//	public interface CurrencyExchangeProxy {
//		
//		@GetMapping("/currency-exchange/from/{from}/to/{to}")
//		public CurrencyConversion retrieveExchangeValue(
//				@PathVariable String from,
//				@PathVariable String to);


	
	@GetMapping("/location/location-get-all")
	public List <Location> allLocationlist();
	
	
}
