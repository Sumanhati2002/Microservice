package com.spring.microservice.exception;

public class ResourceNotFoundException  extends RuntimeException{

	public ResourceNotFoundException() {
		super("in server resource not found");
	}
	public ResourceNotFoundException(String message) {
		super(message);
	}
}
