package com.User.Microservices.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.User.Microservices.Entity.User;
import com.User.Microservices.Service.UserService;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {
    
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/create-user")
	public User createUser (@RequestBody User user) {
		
		return userService.createUser(user);
	}
	
	
	 @GetMapping("/get-user-id/{id}")
		public Optional<User> getUserById(@PathVariable("id") Long id){
		 
		 return userService.getUserById(id);
			
			
			
		}
	
}
