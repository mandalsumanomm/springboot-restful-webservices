package com.webservices.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservices.entity.Employee;
import com.webservices.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployee(){
		return employeeRepository.findAll();		
	}
	
	public Optional<Employee> getEmployeeById(Long id){
		return employeeRepository.findById(null);
		
	}
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}
	
}
