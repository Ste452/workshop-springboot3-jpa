package com.steve.applications.demo_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.steve.applications.demo_example.entities.Category;
	
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
