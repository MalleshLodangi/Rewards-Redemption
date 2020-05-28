package com.project.ProductService.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ProductService.pojo.ProductPojo;
import com.project.ProductService.service.ProductService;

import io.swagger.annotations.Api;

@CrossOrigin
@RestController

@Api
public class ProductController {
	static Logger LOG = Logger.getLogger(ProductController.class.getClass());
	

	@Autowired
	ProductService productService;
	
	
//Rest EndPoint to Retrieve All the products
	@GetMapping("/prod/all")
	
		List<ProductPojo> getAllProducts() throws InterruptedException{
		LOG.info("Entered the end point \'/prod/all'");
		LOG.info("exited end point \'/prod/all'");
		
		return productService.getAllProducts();
		
	}
}
