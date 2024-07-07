package com.steve.applications.demo_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.steve.applications.demo_example.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}
