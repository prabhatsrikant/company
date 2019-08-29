package com.company.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {
	@Id
	private String employeeId;
	private String name;
	private OfficeInfo officeInfo;
	private List<AddressInfo> addressInfo;
	private List<ContactInfo> contactInfo;
	private PersonalInfo personalInfo;
	private BankInfo bankInfo;
	
	public Employee() {
	}

	public Employee(String employeeId, String name, OfficeInfo officeInfo, List<AddressInfo> addressInfo,
			List<ContactInfo> contactInfo, PersonalInfo personalInfo, BankInfo bankInfo) {
		this.employeeId = employeeId;
		this.name = name;
		this.officeInfo = officeInfo;
		this.addressInfo = addressInfo;
		this.contactInfo = contactInfo;
		this.personalInfo = personalInfo;
		this.bankInfo = bankInfo;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", officeInfo=" + officeInfo + ", addressInfo="
				+ addressInfo + ", contactInfo=" + contactInfo + ", personalInfo=" + personalInfo + ", bankInfo="
				+ bankInfo + "]";
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
	public OfficeInfo getOfficeInfo() {
		return officeInfo;
	}
	public void setOfficeInfo(OfficeInfo officeInfo) {
		this.officeInfo = officeInfo;
	}
	public List<AddressInfo> getAddressInfo() {
		return addressInfo;
	}
	public void setAddressInfo(List<AddressInfo> addressInfo) {
		this.addressInfo = addressInfo;
	}
	public List<ContactInfo> getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(List<ContactInfo> contactInfo) {
		this.contactInfo = contactInfo;
	}
	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}
	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}
	public BankInfo getBankInfo() {
		return bankInfo;
	}
	public void setBankInfo(BankInfo bankInfo) {
		this.bankInfo = bankInfo;
	}
	

}
