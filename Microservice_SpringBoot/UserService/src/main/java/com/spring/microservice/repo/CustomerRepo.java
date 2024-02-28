package com.spring.microservice.repo;

import org.springframework.data.repository.CrudRepository;

import com.spring.microservice.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer>{

}