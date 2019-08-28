package com.company.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {
	@Id
	private String employeeId;
	private String name;
	private String age;
	//private Employee manager;
	private String managerId;
	private long salary;
	
	
	public Employee(String employeeId, String name, String age, String managerId, long salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.age = age;
		this.managerId = managerId;
		this.salary = salary;
	}
	
	public Employee() {
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", age=" + age + ", manager=" + managerId
				+ ", salary=" + salary + "]";
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	

}
