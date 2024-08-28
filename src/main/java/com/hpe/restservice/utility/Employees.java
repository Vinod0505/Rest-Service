package com.hpe.restservice.utility;

import java.util.ArrayList; 
import java.util.List;

import com.hpe.restservice.model.Employee;

public class Employees {
	  
    private List<Employee> employeeList;
  
    public List<Employee> getEmployeeList()
    {
  
        if (employeeList == null)
        {
            employeeList = new ArrayList<>();
        }
  
        return employeeList;
    }
  
    public void setEmployeeList(List<Employee> employeeList)
    {
        this.employeeList= employeeList;
    }
}
