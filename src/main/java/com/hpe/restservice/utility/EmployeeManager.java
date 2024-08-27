package com.hpe.restservice.utility;

import com.hpe.restservice.model.Employee;

public class EmployeeManager {

	private Employees employees;
	
	public EmployeeManager() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeManager(Employees employees) {
		super();
		this.employees = employees;
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
}
