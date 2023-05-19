package com.sbi.model.pojo;

public class AccTransactions {
	private int id;
	private	long accId;
	private String txnDateTime;
	private String remark;
	private float amount;
	private boolean isCredited;
	
	public AccTransactions() {
		
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

	public String getTxnDateTime() {
		return txnDateTime;
	}

	public void setTxnDateTime(String txnDateTime) {
		this.txnDateTime = txnDateTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public boolean isCredited() {
		return isCredited;
	}

	public void setCredited(boolean isCredited) {
		this.isCredited = isCredited;
	}
	
}
