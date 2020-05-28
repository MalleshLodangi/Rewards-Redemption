package com.project.LoginService.LoginService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import Exceptions.CustomerNotFound;

@ControllerAdvice
public class ControllerAdvicer {

	@SuppressWarnings("unchecked")
	@ExceptionHandler(value = CustomerNotFound.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ResponseEntity<Object> handleException(CustomerNotFound e){
		
		return new ResponseEntity<>("Customer Not Found", HttpStatus.NOT_FOUND);
	}
}
