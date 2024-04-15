package com.spring.microservice.service.external;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.spring.microservice.entity.Rating;

@Service
@FeignClient(name = "RATING-SERVICE")
public interface RatingServiceEx {

	@GetMapping("rating/user/{userId}")
    public Rating[] getRatingByUserId(@PathVariable int userId);
}
