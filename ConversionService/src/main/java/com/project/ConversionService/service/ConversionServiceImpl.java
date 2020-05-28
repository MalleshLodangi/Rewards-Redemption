package com.project.ConversionService.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ConversionService.dao.ConversionDao;
import com.project.ConversionService.entity.ConversionEntity;
import com.project.ConversionService.pojo.ConversionPojo;

@Service
public class ConversionServiceImpl implements ConversionService{

	
	@Autowired
	ConversionDao conversionDao;

	@Override
	public ConversionPojo getCurrency(Integer cId) {
		
		ConversionPojo conversionPojo = null;
		Optional result = conversionDao.findById(cId);
		if(result.isPresent()) {
			
			ConversionEntity conversionEntity = (ConversionEntity)result.get();
			conversionPojo = new ConversionPojo(conversionEntity.getId(),
												conversionEntity.getName(),
												conversionEntity.getValue());
			
		}
			
		return conversionPojo;
	
	}
	
	
	
	
	@Override
	public List<ConversionPojo> getAllCurrencies() {
	
		List<ConversionPojo> currencyPojo = new ArrayList();
		Iterable<ConversionEntity> currencyEntity = conversionDao.findAll();
		Iterator itr = currencyEntity.iterator();
		
		while(itr.hasNext()) {
			ConversionEntity convEntity = (ConversionEntity) itr.next();
			
			ConversionPojo conversionPojo = new ConversionPojo(convEntity.getId(),
									convEntity.getName(),
									convEntity.getValue());
		    currencyPojo.add(conversionPojo);
		}
		
		return currencyPojo;
	}

	
	
	
}
