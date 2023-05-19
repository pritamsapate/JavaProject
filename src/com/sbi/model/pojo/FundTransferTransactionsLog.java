package com.sbi.model.pojo;

public class FundTransferTransactionsLog {
	private int id;
	private	long txnId;
	private String txnDateTime;
	private float txnAmount;
	private long srcAccNo;
	private long dstAccNo;
	private String remarks;
	
	public FundTransferTransactionsLog() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getTxnId() {
		return txnId;
	}

	public void setTxnId(long txnId) {
		this.txnId = txnId;
	}

	public String getTxnDateTime() {
		return txnDateTime;
	}

	public void setTxnDateTime(String txnDateTime) {
		this.txnDateTime = txnDateTime;
	}

	public float getTxnAmount() {
		return txnAmount;
	}

	public void setTxnAmount(float txnAmount) {
		this.txnAmount = txnAmount;
	}

	public long getSrcAccNo() {
		return srcAccNo;
	}

	public void setSrcAccNo(long srcAccNo) {
		this.srcAccNo = srcAccNo;
	}

	public long getDstAccNo() {
		return dstAccNo;
	}

	public void setDstAccNo(long dstAccNo) {
		this.dstAccNo = dstAccNo;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	

}
