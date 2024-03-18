package com.spring.microservice.responce;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class CustomerResponce {

	private int id;
	private String name;
	private String email;
	private String about;
	
	private List<RatingResponce> ratings=new ArrayList<RatingResponce>();
}