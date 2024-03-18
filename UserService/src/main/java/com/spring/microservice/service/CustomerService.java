package com.spring.microservice.service;

import java.util.List;

import com.spring.microservice.entity.Customer;
import com.spring.microservice.responce.CustomerResponce;

public interface CustomerService {

	Customer createCustomer(Customer customer);

	CustomerResponce getCustomerById(Integer customerId);

	List<Customer> getAllCustomers();

	Customer updateCustomer(Customer customer);

	void deleteCustomer(Integer customerId);

}
