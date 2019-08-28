package com.company.controller;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.exception.EmployeeAlreadyExistException;
import com.company.exception.EmployeeNotFoundException;
import com.company.model.Employee;
import com.company.service.EmployeeService;
import com.company.service.EmployeeServiceImpl;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	EmployeeServiceImpl empService;
	ResponseEntity responseEntity;

	@Autowired
	public EmployeeController(EmployeeServiceImpl empService) {
		this.empService = empService;
	}

	@PostMapping("/save")
	public ResponseEntity<?> saveEmployee(@RequestBody Employee emp) throws EmployeeAlreadyExistException {
		try {
			empService.saveEmployee(emp);
			responseEntity = new ResponseEntity(emp, HttpStatus.CREATED);
		} catch (EmployeeAlreadyExistException e) {
			throw new EmployeeAlreadyExistException();
		} catch (Exception e) {
			responseEntity = new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}

	@PostMapping("/update")
	public ResponseEntity<?> updateEmployee(@RequestBody Employee emp) throws EmployeeNotFoundException {
		try {

			empService.updateEmployee(emp);
			responseEntity = new ResponseEntity(emp, HttpStatus.OK);
		} catch (EmployeeNotFoundException e) {
			throw new EmployeeNotFoundException();
		} catch (Exception e) {
			responseEntity = new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getEmployeeByName(@PathVariable("id") String id) throws EmployeeNotFoundException {
		try {
			Employee emp = empService.getEmployee(id);
			responseEntity = new ResponseEntity(emp, HttpStatus.OK);
		}
		catch (EmployeeNotFoundException e) {
			throw new EmployeeNotFoundException();
			}
		catch (Exception e) {
			responseEntity = new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}

	@GetMapping("/getAll")
	public ResponseEntity<?> getAllEmployee() {
		try {
			responseEntity = new ResponseEntity(empService.getAllEmployee(), HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;

	}

}
