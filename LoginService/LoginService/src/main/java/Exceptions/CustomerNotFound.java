package Exceptions;

import com.project.LoginService.LoginService.pojo.CustomerPojo;

public class CustomerNotFound extends RuntimeException {
	public CustomerNotFound(CustomerPojo customerPojo) {
		super("Not Validated");
	}

}
