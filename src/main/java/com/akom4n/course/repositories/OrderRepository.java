package com.akom4n.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akom4n.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
