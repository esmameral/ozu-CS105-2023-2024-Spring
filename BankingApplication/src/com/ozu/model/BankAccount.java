package com.ozu.model;

public class BankAccount {
	private  static double currencyRate=31;
	private String owner;
	private double balance;
	private int accountNumber;
	private Transaction[] transactions=new Transaction[20];
	
	public static void printInfo() {
		currencyRate=32;
		System.out.println("BankAccount Info");
		System.out.println(currencyRate);
		//System.out.println(toString());//toString() is an instance method
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
		return "owner:"+owner+ " account number:"+accountNumber+" balance:"+balance;
	}
	public static double getCurrencyRate() {
		return currencyRate;
	}
	public static void setCurrencyRate(double currencyRate) {
		BankAccount.currencyRate = currencyRate;
	}
	
	
}
