package com.mzos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mzos.bean.Employee;
import com.mzos.service.EmployeeService;

@RestController
public class MyController {
	@Autowired
	EmployeeService service;
	
	@GetMapping("/employees")
	public List<Employee> showEmployee(){
		return service.showEmployee();
	}
	
	@PostMapping("/employee")
	
	public Employee addEmployee(@RequestBody Employee emp) {
		return service.addEmployee(emp);
	}
}
