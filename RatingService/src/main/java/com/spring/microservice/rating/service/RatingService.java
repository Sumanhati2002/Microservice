package com.spring.microservice.rating.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.spring.microservice.rating.entity.RatingEntity;
import com.spring.microservice.rating.responce.RatingResponce;

public interface RatingService {

	RatingEntity createRating(RatingEntity ratingEntity);

    List<RatingEntity> getAllRatings();
    
    List<RatingEntity> getRatingsByUserId(int userId);
    
    List<RatingEntity> getRatingsByHotelId(int hotelId);
}
