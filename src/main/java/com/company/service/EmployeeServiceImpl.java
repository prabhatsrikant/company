package com.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.exception.EmployeeAlreadyExistException;
import com.company.exception.EmployeeNotFoundException;
import com.company.model.Employee;
import com.company.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository empRespository;
	
	@Override
	public void saveEmployee(Employee emp) throws EmployeeAlreadyExistException {
		empRespository.save(emp);
	}

	@Override
	public Employee getEmployee(String Id) throws EmployeeNotFoundException {
		Employee emp= empRespository.findByEmployeeId(Id);
		if(emp == null) {
			throw new EmployeeNotFoundException();
		}
		return emp;
	}

	@Override
	public Employee updateEmployee(Employee emp) throws EmployeeNotFoundException {
		Employee temp;
		temp = empRespository.findByEmployeeId(emp.getEmployeeId());
		if(temp == null) {
			throw new EmployeeNotFoundException();
		}
		return empRespository.save(emp);
	}
	
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return empRespository.findAll();
	}

	
}
