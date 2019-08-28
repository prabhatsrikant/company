package com.company.service;

import java.util.List;

import com.company.exception.EmployeeAlreadyExistException;
import com.company.exception.EmployeeNotFoundException;
import com.company.model.Employee;

public interface EmployeeService {
	
	void saveEmployee(Employee emp) throws EmployeeAlreadyExistException;
	Employee getEmployee(String name) throws EmployeeNotFoundException;
	Employee updateEmployee(Employee emp) throws EmployeeNotFoundException;
	public List<Employee> getAllEmployee();

}
