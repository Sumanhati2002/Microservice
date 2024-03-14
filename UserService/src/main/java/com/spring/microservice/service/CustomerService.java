package com.spring.microservice.service;

import java.util.List;

import com.spring.microservice.entity.Customer;

public interface CustomerService {

	Customer createCustomer(Customer customer);

	Customer getCustomerById(Integer customerId);

	List<Customer> getAllCustomers();

	Customer updateCustomer(Customer customer);

	void deleteCustomer(Integer customerId);

}
