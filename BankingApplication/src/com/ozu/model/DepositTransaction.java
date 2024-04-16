package com.ozu.model;

public class DepositTransaction extends Transaction{
    public DepositTransaction(double amount) {
    	super(amount);
    }
	@Override
	public void updateAccount(BankAccount acc) {
		//TODO  increase balance
		
		
	}

	

}
