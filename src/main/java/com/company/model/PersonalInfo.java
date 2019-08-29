package com.company.model;

public class PersonalInfo {
	
	private String gender;
	private String maritalStatus;
	private String dob;
	private String spouseName;
	private String fatherName;
	private String mobileNo;
	private String email;
	
	
	
	public PersonalInfo() {
	}

	public PersonalInfo(String gender, String maritalStatus, String dob, String spouseName, String fatherName,
			String mobileNo, String email) {
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.dob = dob;
		this.spouseName = spouseName;
		this.fatherName = fatherName;
		this.mobileNo = mobileNo;
		this.email = email;
	}

	@Override
	public String toString() {
		return "PersonalInfo [gender=" + gender + ", maritalStatus=" + maritalStatus + ", dob=" + dob + ", spouseName="
				+ spouseName + ", fatherName=" + fatherName + ", mobileNo=" + mobileNo + ", email=" + email + "]";
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getSpouseName() {
		return spouseName;
	}
	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
