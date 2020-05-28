package com.project.ConversionService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ConversionService.entity.ConversionEntity;
@Repository
public interface ConversionDao extends JpaRepository<ConversionEntity, Integer> {

}
