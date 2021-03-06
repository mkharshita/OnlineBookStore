package com.capgemini.onlinebookstore.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onlinebookstore.domain.UserBookStoreDto;
import com.capgemini.onlinebookstore.exception.EmptyDataException;
import com.capgemini.onlinebookstore.exception.InvalidDataException;
import com.capgemini.onlinebookstore.exception.UserNameExistException;
import com.capgemini.onlinebookstore.service.RegistrationService;

@RestController
@RequestMapping("/v1/registration")
public class RegistrationController
{
	
	@Autowired
	private RegistrationService service;
	
	@PostMapping("/register")
	public ResponseEntity<UserBookStoreDto>addUser(@Valid @RequestBody UserBookStoreDto dto,BindingResult result) throws InvalidDataException, EmptyDataException, UserNameExistException{
    	return new ResponseEntity<>(service.registerUser(dto,result),HttpStatus.OK);
    }
	
	
	
}
