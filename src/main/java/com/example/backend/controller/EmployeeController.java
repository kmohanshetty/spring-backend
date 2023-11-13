package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.entity.Employee;
import com.example.backend.repository.EmployeeRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/employees")
	public List<Employee> fetchEmployees(){
		System.out.println("~~~fetchEmployees~~~");
		return employeeRepository.findAll();
	}
}
