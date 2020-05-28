package com.project.LoginService.LoginService;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.project.LoginService.LoginService.dao.CustomerDao;
import com.project.LoginService.LoginService.entity.CustomerEntity;
import com.project.LoginService.LoginService.pojo.CustomerPojo;
import com.project.LoginService.LoginService.service.CustomerServiceImpl;
@RunWith(SpringRunner.class)
@SpringBootTest
class LoginServiceApplicationTests {
	@Autowired
	private CustomerServiceImpl customerServiceImpl;
	
	@MockBean
	private CustomerDao custDao;
	
	@Test
	void testUpdate() throws Exception {
		CustomerEntity customerEntity = new CustomerEntity(103, "abhi", "test", 10);
		CustomerEntity customerOutputEntity = new CustomerEntity(103,"abhi","test",10);
		CustomerPojo customerPojo= new CustomerPojo(103,"abhi","test",10);
		when(custDao.save(customerEntity)).thenReturn(customerOutputEntity);
		assertEquals(true, customerServiceImpl.updateRewards(customerEntity));
	}

}
