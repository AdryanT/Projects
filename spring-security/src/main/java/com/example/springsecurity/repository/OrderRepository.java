package com.example.springsecurity.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springsecurity.entity.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
	List<Order> findByAmountGreaterThanOrderByDateCreated (double amount);
}
