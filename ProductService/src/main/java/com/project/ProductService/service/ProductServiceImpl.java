  package com.project.ProductService.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.ProductService.dao.ProductDao;
import com.project.ProductService.entity.ProductEntity;
import com.project.ProductService.pojo.ConversionPojo;
import com.project.ProductService.pojo.ProductPojo;




@Service
public class ProductServiceImpl implements ProductService {

	static Logger LOG = Logger.getLogger(ProductServiceImpl.class.getClass());
	
	@Autowired
	ProductDao productDao;
	
 //To retrieve all Items

	@Override
	public List<ProductPojo> getAllProducts() {
		LOG.info("entered getAllProducts()");
		List<ProductPojo> allProductPojo = new ArrayList();
		Iterable<ProductEntity> allProductEntity = productDao.findAll();
		Iterator itr = allProductEntity.iterator();
		
		while(itr.hasNext()) {
			
			ProductEntity productEntity = (ProductEntity) itr.next();
			
		
			RestTemplate restTemplate = new RestTemplate();
		
			 ResponseEntity<ConversionPojo[]> conversionPojo = restTemplate.getForEntity("http://localhost:8083/ConversionService/all", ConversionPojo[].class);
		
			 ConversionPojo[] conPojo = conversionPojo.getBody();
			 int[] result = new int[3];
			 
			 
			for(int i=0;i<conPojo.length ; i++)  {
			int	a = conPojo[i].getValue();
			int price = productEntity.getPrice();
			
			 result[i] = price / a;
			}
			
			
			
		
			ProductPojo productPojo = new ProductPojo(productEntity.getId(),
													  productEntity.getName(),
													  productEntity.getImage(),
													  productEntity.getPrice(),
													  productEntity.getStock(),
													  productEntity.getDescription(),
													  productEntity.getRemarks(),
													  result[0],
													  result[1],
													  result[2]);
			
			allProductPojo.add(productPojo);
		}
		
		LOG.info("exited getAllProducts()");
		BasicConfigurator.configure();
		
		return allProductPojo;
	}

}
