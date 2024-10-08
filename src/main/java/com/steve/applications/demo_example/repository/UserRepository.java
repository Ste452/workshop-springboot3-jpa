package com.steve.applications.demo_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.steve.applications.demo_example.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User getReferenceById(Long id);
	
}
