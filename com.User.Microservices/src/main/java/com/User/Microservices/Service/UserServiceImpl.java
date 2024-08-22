package com.User.Microservices.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.User.Microservices.Entity.Company;
import com.User.Microservices.Entity.User;
import com.User.Microservices.FeignClient.FeignService;
import com.User.Microservices.Repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private FeignService feign;

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public Optional<User> getUserById(Long id) {
		  Optional<User> companyOptional = userRepo.findById(id);

		    if (companyOptional.isPresent()) {
		        User user = companyOptional.get();
		        try {
		           Company cmpny = feign.getCompanyById(user.getCompanyId());
		            user.setCompany(cmpny);
		            return Optional.of(user);
		        } catch (Exception e) {
		            // Handle Feign client errors
		            e.printStackTrace(); // Log the error or handle it as needed
		            // Possibly return Optional.empty() or handle the situation accordingly
		        }
		    }

		    return Optional.empty();
		}

}
