package com.project.LoginService.LoginService.service;

import com.project.LoginService.LoginService.entity.CustomerEntity;
import com.project.LoginService.LoginService.pojo.CustomerPojo;

public interface CustomerService {

	

	 CustomerPojo validateCustomer(CustomerPojo customerPojo);
	 

		
	 Boolean updateRewards(CustomerEntity customerEntity);
	
	}

