package com.ozu.test;

import com.ozu.model.BankAccount;

public class TestBankAccount {

	public static void main(String[] args) {
		
		
		BankAccount aBankAccount = new BankAccount();
		aBankAccount.setOwner("Sarp");
		aBankAccount.getOwner();
		BankAccount sBankAccount = new BankAccount("Jim", 12345);
		//aBankAccount.owner = "Wayne";//because owner is private
		aBankAccount.setOwner("Barış");
		//BankAccount.setOwner("Your Name");//setOwner is not a static method
		BankAccount.getCurrencyRate();//correct way
		aBankAccount.getCurrencyRate();//don't prefer to use this way
		
		System.out.println(BankAccount.getCurrencyRate());//31
		aBankAccount.sayHello();//33
		
		BankAccount.printInfo();//32
		//aBankAccount.sayHello();
		
	}

}
