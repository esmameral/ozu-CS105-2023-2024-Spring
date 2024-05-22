package com.ozu.model;

import java.util.Date;

public abstract class Transaction implements BankAccountUpdater{
	private Date transactionDate;
	private int id;
	private double amount;
	
	
	
	public Transaction(double amount) {
		super();
		this.amount = amount;
		this.transactionDate=new Date();
	}

	public abstract void updateAccount(BankAccount acc) throws InsufficientBalanceException ;
	
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
		return getClass().getSimpleName()+" [transactionDate=" + transactionDate + ", id=" + id + ", amount=" + amount + "]";
	}

	@Override
	public Date getDate() {
		return transactionDate;
		
	}

	@Override
	public boolean isTransaction() {
		return true;
	}
	
	
	
	
}
