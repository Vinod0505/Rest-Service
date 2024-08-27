package com.hpe.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hpe.restservice.utility.EmployeeManager;
import com.hpe.restservice.utility.Employees;


@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeManager employeeManager;

	@GetMapping("/employees")
	public Employees getEmployees() {
		return employeeManager.getEmployees();
	}
}