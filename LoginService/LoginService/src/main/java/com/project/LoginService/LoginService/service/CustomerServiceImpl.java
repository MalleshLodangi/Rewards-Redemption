package com.project.LoginService.LoginService.service;

import java.util.Optional;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.LoginService.LoginService.dao.CustomerDao;
import com.project.LoginService.LoginService.entity.CustomerEntity;
import com.project.LoginService.LoginService.pojo.CustomerPojo;



@Service
public class CustomerServiceImpl implements CustomerService {
	
	static Logger LOG = Logger.getLogger(CustomerServiceImpl.class.getClass());

	@Autowired
	CustomerDao customerDao;
	
	//To validate the username and password of customer

	@Override
	public CustomerPojo validateCustomer(CustomerPojo customerPojo) {
		BasicConfigurator.configure();
		LOG.info("entered validateCustomer()");
		CustomerEntity customerEntity = customerDao.findByUsernameAndPassword(customerPojo.getUsername(), customerPojo.getPassword());
		System.out.println(customerEntity);
		
		customerPojo = new CustomerPojo(customerEntity.getId(),customerEntity.getUsername(),customerEntity.getPassword(), customerEntity.getRewards());
		
		
		LOG.info("exited validateCustomer()");
		return customerPojo;
	}
	

	
	// Implementation of updating reward points
	
	@Override
	public Boolean updateRewards(CustomerEntity customerEntity) {
		
		
		this.customerDao.save(customerEntity);
		return true;
	}

}
