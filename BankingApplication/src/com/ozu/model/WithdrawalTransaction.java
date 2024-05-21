package com.ozu.model;

public class WithdrawalTransaction extends Transaction{

	public WithdrawalTransaction(double amount) {
		super(amount);
	
	}

	@Override
	public void updateAccount(BankAccount acc) throws InsufficientBalanceException {
		acc.descreaseBalance(getAmount());
		
	}

}
