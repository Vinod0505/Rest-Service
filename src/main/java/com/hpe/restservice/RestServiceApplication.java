package com.hpe.restservice;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.hpe.restservice.controller.EmployeeController;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
			ApplicationContext applicationContext = SpringApplication.run(RestServiceApplication.class, args);
			EmployeeController employeeController = applicationContext.getBean(EmployeeController.class);
			employeeController.getEmployees();
	}

}
