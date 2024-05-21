package com.ozu.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ozu.model.BankAccount;
import com.ozu.model.BillPayment;
import com.ozu.model.CheckTransaction;
import com.ozu.model.DepositTransaction;
import com.ozu.model.InsufficientBalanceException;
import com.ozu.model.OwnerChange;
import com.ozu.model.Transaction;
import com.ozu.model.WithdrawalTransaction;

public class TestBankAccount3 {

	public static void main(String[] args) throws InsufficientBalanceException  {
		BankAccount account = new BankAccount("Jim", 123);
		Transaction tr1=new DepositTransaction(1000);
		Transaction tr2=new WithdrawalTransaction(300);
		Transaction tr3=new CheckTransaction(200);
		Transaction tr4=new BillPayment(150);
		account.post(tr1);
		account.post(tr2);
		account.post(tr3);
		account.post(tr4);
		System.out.println(account);
		//List<Transaction> list= account.allTransactionsLargerThan(200);
		for (Transaction transaction : account.allTransactionsLargerThan(200)) {
			System.out.println(transaction);
		}
		
		System.out.println("Avg:"+account.averageTransactionAmount());
		System.out.println(account);
		
		OwnerChange oc=new OwnerChange("Ayse");
		account.post(oc);
		
		

	}

}
