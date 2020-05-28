package com.project.ConversionService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.ConversionService.pojo.ConversionPojo;
import com.project.ConversionService.service.ConversionService;

@CrossOrigin
@RestController
public class ConversionController {

	@Autowired
	ConversionService conversionService;
	
	
	@GetMapping("all") 
	List<ConversionPojo> getAllCurrencies() {
		
		return conversionService.getAllCurrencies();
	}
	@GetMapping("con/{cId}")
	ConversionPojo getCurrency(@PathVariable ("cId") Integer cId) {
		

	return conversionService.getCurrency(cId);
	}
}
