package com.steve.applications.demo_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.steve.applications.demo_example.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
