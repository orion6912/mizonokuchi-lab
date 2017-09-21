package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "customers", method = RequestMethod.GET)
	public List<Customer> getCustomers() {
		return customerService.getCustomers();
	}
	
	@RequestMapping(value = "customers/{id}", method = RequestMethod.GET)
	public Customer getCustomer(@PathVariable Integer id) {
		return customerService.getCustomer(id);
	}
}