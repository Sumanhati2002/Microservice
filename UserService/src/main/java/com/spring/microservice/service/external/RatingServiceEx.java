package com.spring.microservice.service.external;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.spring.microservice.responce.RatingResponce;

@FeignClient(name = "RATING-SERVICE")
public interface RatingServiceEx {

	@GetMapping("/user/{userId}")
    public ResponseEntity<List<RatingResponce>> getRatingByUserId(@PathVariable int userId);
}
