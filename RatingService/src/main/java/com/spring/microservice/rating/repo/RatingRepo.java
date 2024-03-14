package com.spring.microservice.rating.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.microservice.rating.entity.RatingEntity;

public interface RatingRepo extends CrudRepository<RatingEntity, Integer>{

	List<RatingEntity> findByUserId(int userId);
	
	List<RatingEntity> findByHotelId(int userId);
}
