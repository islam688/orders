package com.example.demo.service;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public List<Order> getOrders() {
    	List<Order> orders = new ArrayList<>();
    	orders.add(new Order("islam" ,0));
    	orders.add(new Order("islam" ,0));
    	orders.add(new Order("islam" ,0));
    	orders.add(new Order("islam" ,0));
    	return orders;
     //  return repository.findAll();
    }
}
