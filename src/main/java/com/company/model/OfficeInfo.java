package com.company.model;

public class OfficeInfo {
	
	private String designation;
	private String managerId;
	private String department;
	private String dateOfJoining;
	private String salary;
	
	
	public OfficeInfo() {
	}
	
	public OfficeInfo(String designation, String managerId, String department, String dateOfJoining, String salary) {
		this.designation = designation;
		this.managerId = managerId;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "OfficeInfo [designation=" + designation + ", managerId=" + managerId + ", department=" + department
				+ ", dateOfJoining=" + dateOfJoining + ", salary=" + salary + "]";
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	

}
