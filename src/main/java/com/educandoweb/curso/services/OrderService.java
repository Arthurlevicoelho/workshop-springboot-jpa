package com.educandoweb.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.curso.entities.Order;
import com.educandoweb.curso.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository userRepository;
	
	public List<Order> findAll(){
		
		return userRepository.findAll();
		
	}
	
	public Order findById(Long id) {
		
	Optional<Order> obj = userRepository.findById(id);
	return obj.get();
	}
	
}
