package com.Location.List.Microservices.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


	
	@Data
	@Getter
	@Setter
	public class Location {

		private Long id;
		
		private String name;
		
		private String fatherName;
		
		private String ComaponyName;
		
		private String Country;
		
		private String State;
		
		private String city;

		public Location(Long id, String name, String fatherName, String comaponyName, String country, String state,
				String city) {
			super();
			this.id = id;
			this.name = name;
			this.fatherName = fatherName;
			ComaponyName = comaponyName;
			Country = country;
			State = state;
			this.city = city;
		}
		
		

}
