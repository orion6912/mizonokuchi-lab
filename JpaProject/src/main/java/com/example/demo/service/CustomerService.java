package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repository;

	public List<Customer> search() {
		List<Customer> result = repository.findAll();
		return result;
	}
	
	public Optional<Customer> findById(Integer id) {
		Optional<Customer> result = repository.findById(id);
		return result;
	}
}