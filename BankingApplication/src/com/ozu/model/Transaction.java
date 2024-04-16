package com.ozu.model;

import java.util.Date;

public abstract class Transaction {
	private Date transactionDate;
	private int id;
	private double amount;
	
	
	public Transaction(double amount) {
		super();
		this.amount = amount;
	}

	public abstract void updateAccount(BankAccount acc) ;
	
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Transaction [transactionDate=" + transactionDate + ", id=" + id + ", amount=" + amount + "]";
	}
	
	
	
	
}
