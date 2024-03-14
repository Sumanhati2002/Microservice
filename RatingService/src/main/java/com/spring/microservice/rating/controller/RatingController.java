package com.spring.microservice.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.microservice.rating.entity.RatingEntity;
import com.spring.microservice.rating.service.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {

	@Autowired
	private RatingService ratingService;
	
	@PostMapping
    public ResponseEntity<RatingEntity> createUser(@RequestBody RatingEntity ratingEntity){
		RatingEntity savedUser = ratingService.createRating(ratingEntity);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
	
	// http://localhost:8383/rating
	@GetMapping
    public ResponseEntity<List<RatingEntity>> getAllRatings(){
        List<RatingEntity> ratings = ratingService.getAllRatings();
        return new ResponseEntity<>(ratings, HttpStatus.OK);
    }
	
	@GetMapping("/user/{userId}")
    public ResponseEntity<List<RatingEntity>> getRatingByUserId(@PathVariable int userId){
        List<RatingEntity> ratingsByUser = ratingService.getRatingsByUserId(userId);
        return new ResponseEntity<>(ratingsByUser, HttpStatus.OK);
    }
	
	@GetMapping("/hotel/{hotelId}")
    public ResponseEntity<List<RatingEntity>> getRatingByHotelId(@PathVariable int  hotelId){
        List<RatingEntity> ratingsByHotel = ratingService.getRatingsByHotelId(hotelId);
        return new ResponseEntity<>(ratingsByHotel, HttpStatus.OK);
    }
}
