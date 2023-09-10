package com.akom4n.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akom4n.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
