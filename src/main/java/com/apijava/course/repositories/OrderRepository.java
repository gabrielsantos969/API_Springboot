package com.apijava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apijava.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
