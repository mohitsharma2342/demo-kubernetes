package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	public List<Employee> getEmployee() {
		return (List<Employee>) employeeRepository.findAll();
	}

}
