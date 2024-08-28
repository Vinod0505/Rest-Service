package com.hpe.restservice.utility;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hpe.restservice.model.Employee;

@Component
public class EmployeeManager {

	@Autowired
	private Employees employees;

	public EmployeeManager(Employees employees) {
		this.employees=employees;
		initializeEmployees();
	}
	private void initializeEmployees() {
		employees.getEmployeesList().add(new Employee(1, "John", "Doe", "john.doe@example.com", "Developer"));
		employees.getEmployeesList().add(new Employee(2, "Jane", "Smith", "jane.smith@example.com", "Manager"));
		employees.getEmployeesList().add(new Employee(3, "Mike", "Johnson", "mike.johnson@example.com", "Designer"));
	}

	public Employees getEmployees() {
		return employees;
	}
	
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employees.getEmployeesList().add(employee);
	}
}
