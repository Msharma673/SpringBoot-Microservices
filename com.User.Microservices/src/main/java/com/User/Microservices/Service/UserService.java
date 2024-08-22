package com.User.Microservices.Service;

import java.util.List;
import java.util.Optional;

import com.User.Microservices.Entity.User;



public interface UserService {
	
	// create

	public User createUser(User user);

	// get all
	public List<User> getAllUser();

//	// get single
//	Company get(Long id);

	public Optional<User> getUserById(Long id);


}
