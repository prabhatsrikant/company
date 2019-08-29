package com.company.model;

public class AddressInfo {
	
	private String houseNo;
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String zip;
	private boolean currentORpermanent;
	
	
	public AddressInfo(String houseNo, String street1, String street2, String city, String state, String zip,
			boolean currentORpermanent) {
		this.houseNo = houseNo;
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.currentORpermanent = currentORpermanent;
	}

	public AddressInfo() {
	}

	@Override
	public String toString() {
		return "AddressInfo [houseNo=" + houseNo + ", street1=" + street1 + ", street2=" + street2 + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + "]";
	}
	
	public boolean isCurrentORpermanent() {
		return currentORpermanent;
	}

	public void setCurrentORpermanent(boolean currentORpermanent) {
		this.currentORpermanent = currentORpermanent;
	}

	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	
}
