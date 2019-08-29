package com.company.model;

public class ContactInfo {
	
	private String name;
	private String contactNo;
	private String relationship;
	
	
	public ContactInfo() {
	}
	
	public ContactInfo(String name, String contactNo, String relationship) {
		this.name = name;
		this.contactNo = contactNo;
		this.relationship = relationship;
	}
	
	@Override
	public String toString() {
		return "ContactInfo [name=" + name + ", contactNo=" + contactNo + ", relationship=" + relationship + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

}
