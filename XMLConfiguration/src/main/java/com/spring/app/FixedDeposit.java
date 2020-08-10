package com.spring.app;

public class FixedDeposit {
	private int accountNumber;
	private String accntHolderName;
	private float amt;
	private int tenure;
	private float interestRate;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccntHolderName() {
		return accntHolderName;
	}
	public void setAccntHolderName(String accntHolderName) {
		this.accntHolderName = accntHolderName;
	}
	public float getAmt() {
		return amt;
	}
	public void setAmt(float amt) {
		this.amt = amt;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	}
