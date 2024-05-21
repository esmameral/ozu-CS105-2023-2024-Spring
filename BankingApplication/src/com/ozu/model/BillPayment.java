package com.ozu.model;

public class BillPayment extends WithdrawalTransaction {
	public static double FEE=15; 

	public BillPayment(double amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateAccount(BankAccount acc) throws InsufficientBalanceException {
		super.updateAccount(acc);
		//acc.descreaseBalance(BillPayment.FEE);
		acc.descreaseBalance(FEE);
	}
	
	

}
