package com.example.spt.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.spt.entity.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
	
	List<Order> findByAmountGreaterThanOrderByDateCreated (double amount);
}
