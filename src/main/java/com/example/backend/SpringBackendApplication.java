package com.example.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.backend.entity.Employee;
import com.example.backend.repository.EmployeeRepository;

@SpringBootApplication
public class SpringBackendApplication implements CommandLineRunner{

	@Autowired
	EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee1 = Employee.builder().
				firstName("Mohan").
				lastName("Krishnamurthy").
				email("mk@mk.com").build();
		Employee employee2 = Employee.builder().
				firstName("Ragnar").
				lastName("Lothbrok").
				email("ragnar@lothbrok.com").build();
		Employee employee3 = Employee.builder().
				firstName("Tony").
				lastName("Stark").
				email("tony@stark.com").build();
		
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
	}

}
