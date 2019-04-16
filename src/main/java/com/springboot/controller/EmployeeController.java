package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.EmployeeModel;
import com.springboot.service.EmployeeService;

@RestController
public class EmployeeController {
@Autowired
private EmployeeService employeeService;
@RequestMapping(value="/add/employee",method=RequestMethod.GET)
public EmployeeModel addEmployee(@RequestParam("name")String name,@RequestParam("id")int id) {
	return employeeService.createEmployee(name,id);

}
}
