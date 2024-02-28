package com.spring.microservice.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.spring.microservice.service.payload.ApiResponce;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFound.class)
	public ResponseEntity<ApiResponce> HandlerResourceNotFoundException(ResourceNotFound ex){
		
		String message= ex.getMessage();
		ApiResponce responnse=ApiResponce.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
		return new ResponseEntity<ApiResponce>(responnse,HttpStatus.NOT_FOUND);
	}
}
