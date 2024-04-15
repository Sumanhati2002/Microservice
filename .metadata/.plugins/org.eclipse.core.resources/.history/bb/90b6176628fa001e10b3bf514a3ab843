package com.spring.microservice.hotel.controller;

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

import com.spring.microservice.hotel.entity.Hotel;
import com.spring.microservice.hotel.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	 @PostMapping
	    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
	        Hotel savedHotel = hotelService.createHotel(hotel);
	        return new ResponseEntity<>(savedHotel, HttpStatus.CREATED);
	    }

	    // http://localhost:8080/api/users/1
	    @GetMapping("{id}")
	    public ResponseEntity<Hotel> getHotelById(@PathVariable("id") Integer hotelId){
	    	Hotel hotel = hotelService.getHotelById(hotelId);
	        return new ResponseEntity<>(hotel, HttpStatus.OK);
	    }

	    // http://localhost:8080/api/users
	    @GetMapping
	    public ResponseEntity<List<Hotel>> getAllHotels(){
	        List<Hotel> hotels = hotelService.getAllHotels();
	        return new ResponseEntity<>(hotels, HttpStatus.OK);
	    }
	    
}
