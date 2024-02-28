package com.spring.microservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.microservice.entity.Customer;
import com.spring.microservice.repo.CustomerRepo;
import com.spring.microservice.service.CustomerService;
import com.spring.microservice.service.exception.ResourceNotFound;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerImpl implements CustomerService{

	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	@Override
	public Customer getCustomerById(Integer customerId) {
		// TODO Auto-generated method stub
	        return customerRepo.findById(customerId).orElseThrow(()->new ResourceNotFound("one error message is coming!!!!"+customerId));
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return (List<Customer>) customerRepo.findAll();
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Customer existingCustomer = customerRepo.findById(customer.getId()).get();
		existingCustomer.setName(customer.getName());
		existingCustomer.setEmail(customer.getEmail());
		existingCustomer.setAbout(customer.getAbout());
        Customer updatedUser = customerRepo.save(existingCustomer);
        return updatedUser;
	}

	@Override
	public void deleteCustomer(Integer customerId) {
		// TODO Auto-generated method stub
		customerRepo.deleteById(customerId);
	}

	
	
}
