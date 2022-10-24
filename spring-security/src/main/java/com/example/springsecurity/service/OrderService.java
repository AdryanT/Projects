package com.example.springsecurity.service;

import com.example.springsecurity.entity.Order;
import com.example.springsecurity.repository.OrderRepository;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

	private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    
    public List<Order> getAllOrders(){
        List<Order> orders = new ArrayList<>();
        orderRepository.findAll().forEach(x -> orders.add(x));
        return orders;
    }

    public Order getOrder (Long id){
        return orderRepository.findById(id).orElse(null);
    }

    public Order saveOrder(Order order){
        return orderRepository.save(order);
    }

    public void deleteOrder(long id){
    	orderRepository.deleteById(id);
    }
}