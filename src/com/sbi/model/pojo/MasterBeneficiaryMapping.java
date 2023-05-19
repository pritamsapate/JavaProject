package com.sbi.model.pojo;

public class MasterBeneficiaryMapping {
	private int id;
	private	long accId;
	private long payeeId;
	
	public MasterBeneficiaryMapping() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAccId() {
		return accId;
	}

	public void setAccId(long accId) {
		this.accId = accId;
	}

	public long getPayeeId() {
		return payeeId;
	}

	public void setPayeeId(long payeeId) {
		this.payeeId = payeeId;
	}
	
	
}
