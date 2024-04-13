package com.spring.microservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rating {

	private int id;
	private int userId;
	private int hotelId;
	private int rating;
	private String feedback;
	
	private Hotel hotel;
}
