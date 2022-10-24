package com.example.spt.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spt.entity.Order;
import com.example.spt.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getAllUsers(){
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Order getUser (@PathVariable("id") long id){
        return orderService.getOrder(id);
    }

    @PostMapping
    public Order saveUser (@RequestBody Order order){
        return orderService.saveOrder(order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable("id") long id){
    	orderService.deleteOrder(id);
    }
    
    @GetMapping("/amount")
    public List<Order> findByAmountGreaterThanOrderByDateCreated (@RequestParam Double amount){
    	return orderService.findByAmountGreaterThanOrderByDateCreated(amount);
    }
}
