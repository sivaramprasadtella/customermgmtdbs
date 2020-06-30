package com.siva.ordermanagement.springbootjpacrud.controller;


import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siva.ordermanagement.springbootjpacrud.exception.ResourceNotFoundException;
import com.siva.ordermanagement.springbootjpacrud.model.OrderInfo;
import com.siva.ordermanagement.springbootjpacrud.repo.OrderRepository;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class OrderController {
	@Autowired
	private OrderRepository employeeRepository;

	@GetMapping("/all/orders")
	public List<OrderInfo> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@GetMapping("/order/{id}")
	public ResponseEntity<OrderInfo> getEmployeeById(@PathVariable(value = "id") Long orderId)
			throws ResourceNotFoundException {
		OrderInfo employee = employeeRepository.findById(orderId)
				.orElseThrow(() -> new ResourceNotFoundException("Oeder not found for this id :: " + orderId));
		return ResponseEntity.ok().body(employee);
	}

	@PostMapping("/Orders")
	public OrderInfo createEmployee(@Valid @RequestBody OrderInfo order) {
		return employeeRepository.save(order);
	}
}
