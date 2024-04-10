package com.spring.microservice.rating.service.impl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.microservice.rating.entity.RatingEntity;
import com.spring.microservice.rating.repo.RatingRepo;
import com.spring.microservice.rating.responce.RatingResponce;
import com.spring.microservice.rating.service.RatingService;

@Service
public class RatingImpl implements RatingService{

	@Autowired
	private RatingRepo ratingRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public RatingEntity createRating(RatingEntity ratingEntity) {
		// TODO Auto-generated method stub
		return ratingRepo.save(ratingEntity);
	}

	@Override
	public List<RatingEntity> getAllRatings() {
		// TODO Auto-generated method stub
		return (List<RatingEntity>) ratingRepo.findAll();
	}

	@Override
	public List<RatingEntity> getRatingsByHotelId(int hotelId) {
		// TODO Auto-generated method stub
		
		return ratingRepo.findByHotelId(hotelId);
	}

	/*
	 * @Override public List<RatingEntity> getRatingsByUserId(int userId) { // TODO
	 * Auto-generated method stub List<RatingEntity> ratingByEmployeeId
	 * =ratingRepo.findByUserId(userId); RatingResponce
	 * ratingResponce=mapper.map(ratingByEmployeeId, RatingResponce.class); return
	 * (List<RatingEntity>) ratingResponce; }
	 */
	@Override
	public List<RatingEntity> getRatingsByUserId(int userId) {
		// TODO Auto-generated method stub
		
		return ratingRepo.findByUserId(userId);
	}

}
