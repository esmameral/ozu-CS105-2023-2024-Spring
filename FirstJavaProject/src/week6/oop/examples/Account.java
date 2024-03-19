package week6.oop.examples;

public class Account {
	private String accNumber;
	private double balance;
	private static double usdRate=31.5;
	
	public Account(String accNumber, double balance) {
		super();
		this.accNumber = accNumber;
		this.balance = balance;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getUsdRate() {
		return usdRate;
	}

	public static void setUsdRate(double usdRate) {
		Account.usdRate = usdRate;
	}

	@Override
	public String toString() {
		
		return accNumber+" "+" with balance "+getBalance();
	}
	

}
