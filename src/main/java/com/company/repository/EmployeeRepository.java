package com.company.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.company.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String>{
	
	public Employee findByEmployeeId(String Id);
	
}
