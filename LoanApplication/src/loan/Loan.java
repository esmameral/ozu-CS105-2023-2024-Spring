package loan;

import java.util.ArrayList;

public class Loan {
	private double loanAmount;
	private double interestRate;
	private int loanTerm;
	private double monthlyPayment;
	private ArrayList<MonthlyPaymentDetails> paymentDetails ;

	public Loan(double loanAmount, double interestRate, int loanTerm) {
		super();
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		this.loanTerm = loanTerm;
		this.paymentDetails= new ArrayList<MonthlyPaymentDetails>();
		this.monthlyPayment = calculateMonthlyPayment(loanAmount, interestRate, loanTerm);
		calculateDetails();

	}

	private void calculateDetails() {
		double prevRemainingLoan=loanAmount;
		for(int i=1;i<=loanTerm;i++) {
			MonthlyPaymentDetails aDetail=new MonthlyPaymentDetails();
			aDetail.setMonth(i);
			aDetail.setMonthlyInterest(prevRemainingLoan*interestRate);
			aDetail.setMonthlyPaidLoan(monthlyPayment-aDetail.getMonthlyInterest());
			aDetail.setRemainingLoan(prevRemainingLoan-aDetail.getMonthlyPaidLoan());
			paymentDetails.add(aDetail);
			prevRemainingLoan=aDetail.getRemainingLoan();	
		}
	}

	private double calculateMonthlyPayment(double loanAmount, double interestRate, int loanTerm) {
		return loanAmount * interestRate * Math.pow((1 + interestRate), loanTerm)
				/ (Math.pow((1 + interestRate), loanTerm) - 1);
	}

	public void printMontlyPaymentDetailFor(int month) {
        MonthlyPaymentDetails detail= paymentDetails.get(month-1);
        System.out.println(detail);
		
	}

	public double getInterestRate() {
		return interestRate;
	}

	public int getLoanTerm() {
		return loanTerm;
	}

	public double getMonthlyPayment() {
		return monthlyPayment;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public ArrayList<MonthlyPaymentDetails> getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(ArrayList<MonthlyPaymentDetails> paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}

	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

	@Override
	public String toString() {
		return "Loan [loanAmount=" + loanAmount + ", interestRate=" + interestRate + ", loanTerm=" + loanTerm
				+ ", monthlyPayment=" + monthlyPayment + "]";
	}

}
