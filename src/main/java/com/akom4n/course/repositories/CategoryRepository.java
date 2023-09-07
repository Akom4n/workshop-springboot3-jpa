package com.akom4n.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akom4n.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
