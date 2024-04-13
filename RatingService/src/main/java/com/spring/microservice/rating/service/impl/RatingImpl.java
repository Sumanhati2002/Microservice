package com.spring.microservice.rating.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.microservice.rating.entity.RatingEntity;
import com.spring.microservice.rating.repo.RatingRepo;
import com.spring.microservice.rating.service.RatingService;


@Service
public class RatingImpl implements RatingService {

	@Autowired
	private RatingRepo ratingRepo;

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

	@Override
	public List<RatingEntity> getRatingsByUserId(int userId) {
		// TODO Auto-generated method stub

		return ratingRepo.findByUserId(userId);
	}

}
