package com.spring.microservice.hotel.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.microservice.hotel.entity.Hotel;
import com.spring.microservice.hotel.repo.HotelRepo;
import com.spring.microservice.hotel.service.HotelService;

@Service
public class HotelImpl implements HotelService{

	@Autowired
	private HotelRepo hotelRepo;
	
	@Override
	public Hotel createHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return hotelRepo.save(hotel);
	}

	@Override
	public Hotel getHotelById(Integer hotelId) {
		// TODO Auto-generated method stub
		Optional<Hotel> hotelById= hotelRepo.findById(hotelId);
		return hotelById.get();
	}

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return (List<Hotel>) hotelRepo.findAll();
	}

	

	


//	@Override
//	public Hotel updateHotel(Hotel hotel) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void deleteHotel(Integer hotelId) {
//		// TODO Auto-generated method stub
//		
//	}

}
