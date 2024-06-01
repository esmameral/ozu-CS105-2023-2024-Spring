package model;

public class Promotion {
	private String discountCode;
	private double discountRate;
	private boolean used=false;
	
	public Promotion(String discountCode, double discountRate) {
		super();
		this.discountCode = discountCode;
		this.discountRate = discountRate;
	}
	public String getDiscountCode() {
		return discountCode;
	}
	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public boolean isUsed() {
		return used;
	}
	public void setUsed(boolean used) {
		this.used = used;
	}
	
}
