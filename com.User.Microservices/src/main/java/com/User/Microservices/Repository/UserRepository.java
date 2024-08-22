package com.User.Microservices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.User.Microservices.Entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
