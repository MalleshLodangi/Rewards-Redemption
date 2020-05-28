package com.project.ProductService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ProductService.entity.ProductEntity;

@Repository
public interface ProductDao extends JpaRepository<ProductEntity, Integer> {

}
