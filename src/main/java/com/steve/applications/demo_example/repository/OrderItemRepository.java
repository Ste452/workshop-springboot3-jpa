package com.steve.applications.demo_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.steve.applications.demo_example.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
