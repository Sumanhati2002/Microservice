package com.spring.microservice.service.external;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@Service
@FeignClient(name = "HOTEL-SERVICE")
public interface HotelServiceEx {

	@GetMapping("/hotel/{id}")
    com.spring.microservice.entity.Hotel getHotelByUserId(@PathVariable int id);
}
