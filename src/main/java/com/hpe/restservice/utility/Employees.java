package com.hpe.restservice.utility;

import java.util.List;

import com.hpe.restservice.model.Employee;

public class Employees {

	private List<Employee> employeesList;

	public Employees() {
		// TODO Auto-generated constructor stub
	}
	
	public Employees(List<Employee> employeesList) {
		super();
		this.employeesList = employeesList;
	}

	public List<Employee> getEmployeesList() {
		return employeesList;
	}

	public void setEmployeesList(List<Employee> employeesList) {
		this.employeesList = employeesList;
	}
	
	
	
}
