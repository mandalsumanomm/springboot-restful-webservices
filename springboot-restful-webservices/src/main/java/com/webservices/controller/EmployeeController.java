package com.webservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.entity.Employee;
import com.webservices.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeSercice;
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeSercice.getAllEmployee();
	}
	
	@GetMapping("/{id}")
	public  Employee getEmployeeById(@PathVariable Long id) {
		return employeeSercice.getEmployeeById(id).orElse(null);
	}
	
	@PostMapping
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeSercice.saveEmployee(employee);
	}
	
	
	public void deleteEmployee(@PathVariable Long id) {
		employeeSercice.deleteEmployee(id);
	}
	
	
}
