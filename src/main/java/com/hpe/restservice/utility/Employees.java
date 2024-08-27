package com.hpe.restservice.utility;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hpe.restservice.model.Employee;

@Component
public class Employees {

	private List<Employee> employeesList = new ArrayList<Employee>();

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
