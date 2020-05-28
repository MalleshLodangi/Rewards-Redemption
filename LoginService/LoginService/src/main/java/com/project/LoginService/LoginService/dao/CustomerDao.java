package com.project.LoginService.LoginService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.LoginService.LoginService.entity.CustomerEntity;



@Repository
public interface CustomerDao extends JpaRepository<CustomerEntity, Integer> {
	CustomerEntity findByUsernameAndPassword(String username, String password);
	
	
}
