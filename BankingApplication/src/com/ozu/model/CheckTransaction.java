package com.ozu.model;

public class CheckTransaction extends WithdrawalTransaction{

	public CheckTransaction(double amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		
		return super.toString()+ " Check Number:";
	}

	
}
