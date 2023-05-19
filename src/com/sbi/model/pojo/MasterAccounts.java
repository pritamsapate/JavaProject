package com.sbi.model.pojo;

public class MasterAccounts {
	private int id;
	private	long accNo;
	private String accHolderName;
	private String accHolderPhone;
	
	public MasterAccounts() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public String getAccHolderPhone() {
		return accHolderPhone;
	}

	public void setAccHolderPhone(String accHolderPhone) {
		this.accHolderPhone = accHolderPhone;
	}
	
}
