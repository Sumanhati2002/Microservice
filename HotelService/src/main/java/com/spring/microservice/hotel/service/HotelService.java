package com.spring.microservice.hotel.service;

import java.util.List;

import com.spring.microservice.hotel.entity.Hotel;

public interface HotelService {

	Hotel createHotel(Hotel hotel);

	Hotel getHotelById(Integer hotelId);

    List<Hotel> getAllHotels();

}
