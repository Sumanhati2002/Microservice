package com.spring.microservice.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.microservice.entity.Customer;
import com.spring.microservice.entity.Hotel;
import com.spring.microservice.entity.Rating;
import com.spring.microservice.exception.ResourceNotFoundException;
import com.spring.microservice.repo.CustomerRepo;
import com.spring.microservice.service.CustomerService;
import com.spring.microservice.service.external.HotelServiceEx;
import com.spring.microservice.service.external.RatingServiceEx;

@Service
public class CustomerImpl implements CustomerService {

	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private RatingServiceEx ratingServiceEx;
	 

	@Autowired
	private HotelServiceEx hotelServiceEx;
	
	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	@Override
	public Customer getCustomerById(Integer customerId) {
		Customer customer2 = customerRepo.findById(customerId).orElseThrow(()->new ResourceNotFoundException("error!!!"));
		Rating[] ratinguser = ratingServiceEx.getRatingByUserId(customer2.getId());
		List<Rating> ratings2 = Arrays.stream(ratinguser).toList();
		List<Rating> ratingList =ratings2.stream().map(rating->{
			Hotel hotel= hotelServiceEx.getHotelByUserId(rating.getHotelId());
			rating.setHotel(hotel);
			return rating;
		}).collect(Collectors.toList());
		customer2.setRatings(ratingList);
		return customer2;
	
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
