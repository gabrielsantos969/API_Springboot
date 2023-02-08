package com.apijava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apijava.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
