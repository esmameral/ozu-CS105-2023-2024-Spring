package quizzes.quiz2;

public class Employee {
	private int id;
	private String fullName;
	private double pricePerHour;
	private double totalPayment;
	private double totalWorkedHours;

	public Employee(int id, String fullName, double pricePerHour) {
		this.id = id;
		this.fullName = fullName;
		this.pricePerHour = pricePerHour;
	}

	
	@Override
	public String toString() {
		return fullName + "'s total payment is " + totalPayment + " TL for " + totalWorkedHours+" hours of work";
	}


	public Employee(int id, String fullName) {
		this(id, fullName, 1000);
	}

	public void addWork(int hours) {
		this.totalWorkedHours += hours;
		this.totalPayment += hours * pricePerHour;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}


	


	public double getTotalPayment() {
		return totalPayment;
	}


	public void setTotalPayment(double totalPayment) {
		this.totalPayment = totalPayment;
	}


	public double getTotalWorkedHours() {
		return totalWorkedHours;
	}


	public void setTotalWorkedHours(double totalWorkedHours) {
		this.totalWorkedHours = totalWorkedHours;
	}
}
