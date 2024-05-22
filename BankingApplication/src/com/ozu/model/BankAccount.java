package com.ozu.model;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
	private  static double currencyRate=31;
	private String owner;
	private double balance;
	private int accountNumber;
	private ContactInfo contact = new ContactInfo();
	
	//private Transaction[] transactions=new Transaction[20];
	private ArrayList<Transaction> transactions=new ArrayList<Transaction>();
	
	public void printAllTransactions() {
		//must print only transactions

	}
	
    public void printBankAccountHistory() {
		//must print everything. transactions, owner change, contact change
    	
	}
	
	public static void printInfo() {
		currencyRate=32;
		System.out.println("BankAccount Info");
		System.out.println(currencyRate);
		//System.out.println(toString());//toString() is an instance method
	}
	

	public List<Transaction> allTransactionsLargerThan(double x) {
		ArrayList<Transaction> list=new ArrayList<Transaction>();
		for (Transaction transaction : transactions) {
			if(transaction.getAmount()>x)
				list.add(transaction);
		}
		
		return list;
	}
	
	public double averageTransactionAmount( ) {
		double sum=0;
		for (Transaction transaction : transactions) {
			sum+=transaction.getAmount();
		}
		return sum/transactions.size();
	}

	public void increaseBalance(double amount) { 
		//balance=balance+amount;
		balance+=amount;
	}
	public void descreaseBalance(double amount)throws InsufficientBalanceException { 
		//balance=balance-amount;
		if(balance>=amount)
			balance-=amount;
		else {
			throw new InsufficientBalanceException("Your balance is unsufficient. You can withdraw max "+balance);
		}
			
	}

	public void sayHello() {
		currencyRate=33;
		System.out.println("Hello from instance method");
		System.out.println(currencyRate);
		//System.out.println(getCurrencyRate());
		System.out.println(toString());
	
	}
	public BankAccount() {
		this.accountNumber=(int)(Math.random()*1000);
	}
	public BankAccount(String owner,int accountId) {
		this.owner=owner;
		this.accountNumber=accountId;
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		System.out.println("owner changed");
		this.owner = owner;
	}
	public double getBalance() {
		return balance;
	}
	private void setBalance(double balance) {
		this.balance = balance;
	}
	private int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	public String toString() {
		return getClass().getSimpleName()+"["+owner+ "'s "+balance+ "] "+
				contact.toString();
	}
	public static double getCurrencyRate() {
		return currencyRate;
	}
	public static void setCurrencyRate(double currencyRate) {
		BankAccount.currencyRate = currencyRate;
	}

	public void post(BankAccountUpdater anUpdate) throws InsufficientBalanceException {
		anUpdate.updateAccount(this);
		if(anUpdate.isTransaction())
			transactions.add((Transaction)anUpdate);
	}
		
		

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}


	public ContactInfo getContact() {
		return contact;
	}


	public void setContact(ContactInfo contact) {
		this.contact = contact;
	}


	


	
	
	
	
}
