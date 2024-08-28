package com.hpe.restservice.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.hpe.restservice.model.Employee;
import com.hpe.restservice.utility.EmployeeManager;
import com.hpe.restservice.utility.Employees;


@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
    private EmployeeManager employeeManager;

    @GetMapping(path = "/", produces = "application/json")
    public Employees getEmployees()
    {
        return employeeManager.getAllEmployees();
    }
    
    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee)
    {
        employeeManager.addEmployee(employee);
  
        URI location = ServletUriComponentsBuilder
                  .fromCurrentRequest()
                  .path("/{id}")
                  .buildAndExpand(employee.getId())
                  .toUri();
  
        return ResponseEntity.created(location).build();
    }

}