package com.mzos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mzos.bean.Employee;
import com.mzos.repo.IEmpRepo;

@Service
public class EmployeeService {
	@Autowired
	IEmpRepo repo;
	
	public List<Employee> showEmployee() {

		return repo.findAll();
	}

	public Employee addEmployee(Employee emp) {

		return repo.save(emp);
	}

	
}
