package com.company.model;

public class BankInfo {
	
	private String accountNo;
	private String bankName;
	
	
	public BankInfo() {
	}

	public BankInfo(String accountNo, String bankName) {
		this.accountNo = accountNo;
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "BankInfo [accountNo=" + accountNo + ", bankName=" + bankName + "]";
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}
