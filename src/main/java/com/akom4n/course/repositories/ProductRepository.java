package com.akom4n.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akom4n.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
