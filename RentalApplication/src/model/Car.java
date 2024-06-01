package model;

public class Car extends Vehicle {
	private int seatCount;

	public Car(String make, String model, int year, String licensePlateNumber, String transmission, int seatCount) {
		super(make, model, year, licensePlateNumber, transmission);
		this.seatCount=seatCount;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	@Override
	public double getDailyPrice() {
		return 1500;
	}

	@Override
	public boolean checkRentalRestrictions(Driver d) {
		if (d.getAge()>=18 && d.getDriverLicenseYear()>=2)
			return true;
		else
			return false;
	}

}
