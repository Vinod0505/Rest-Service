package com.hpe.restservice;

import java.util.List;

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
