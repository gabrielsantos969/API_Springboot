package com.apijava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apijava.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
