package loan;

public class MonthlyPaymentDetails {
	private int month;
	private double monthlyInterest;
	private double monthlyPaidLoan;
	private double remainingLoan;

	



	public int getMonth() {
		return month;
	}



	public double getMonthlyInterest() {
		return monthlyInterest;
	}



	public double getMonthlyPaidLoan() {
		return monthlyPaidLoan;
	}



	public double getRemainingLoan() {
		return remainingLoan;
	}



	public void setMonth(int month) {
		this.month = month;
	}



	public void setMonthlyInterest(double monthlyInterest) {
		this.monthlyInterest = monthlyInterest;
	}



	public void setMonthlyPaidLoan(double monthlyPaidLoan) {
		this.monthlyPaidLoan = monthlyPaidLoan;
	}



	public void setRemainingLoan(double remainingLoan) {
		this.remainingLoan = remainingLoan<0?0:remainingLoan;
	}



	@Override
	public String toString() {
		return "month=" + month + ", monthlyInterest=" + monthlyInterest + ", monthlyPaidLoan="
				+ monthlyPaidLoan + ", remainingLoan=" + remainingLoan;
	}
}
