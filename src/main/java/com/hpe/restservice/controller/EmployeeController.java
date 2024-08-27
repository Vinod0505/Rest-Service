package com.hpe.restservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hpe.restservice.utility.EmployeeManager;
import com.hpe.restservice.utility.Employees;

@RestController("/")
public class EmployeeController {
	private EmployeeManager employeeManager = new EmployeeManager();

	@GetMapping("employees")
	public Employees getEmployees() {
		return employeeManager.getEmployees();
	}
}