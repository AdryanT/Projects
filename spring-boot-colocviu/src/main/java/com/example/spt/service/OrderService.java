package com.example.spt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spt.entity.Order;
import com.example.spt.repository.OrderRepository;

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
    
    public List<Order> findByAmountGreaterThanOrderByDateCreated (double amount){
    	return orderRepository.findByAmountGreaterThanOrderByDateCreated(amount);
    }

}
