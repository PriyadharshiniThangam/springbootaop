package com.springboot.service;

import org.springframework.stereotype.Service;

import com.springboot.model.EmployeeModel;

@Service
public class EmployeeService {
	public EmployeeModel createEmployee(String name, int id) {
		EmployeeModel emp=new EmployeeModel();
		emp.setName(name);
		emp.setId(id);
		return emp;
	}
}
