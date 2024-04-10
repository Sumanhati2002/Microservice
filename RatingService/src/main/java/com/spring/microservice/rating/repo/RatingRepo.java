package com.spring.microservice.rating.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.microservice.rating.entity.RatingEntity;

@Repository
public interface RatingRepo extends CrudRepository<RatingEntity, Integer>{

	List<RatingEntity> findByUserId(int userId);
	
	List<RatingEntity> findByHotelId(int hotelId);
}
