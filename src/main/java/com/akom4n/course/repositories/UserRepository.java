package com.akom4n.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akom4n.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
