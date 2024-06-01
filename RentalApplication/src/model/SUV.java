package model;

public class SUV extends Car  {

	private double towingCapacity;

	public SUV(String make, String model, int year, String licensePlateNumber, String transmission, int seatCount,double towingCapacity) {
		super(make, model, year, licensePlateNumber, transmission, seatCount);
		this.towingCapacity=towingCapacity;
	}
	
	@Override
	public boolean checkRentalRestrictions(Driver d) {
		if (d.getAge()>=21 && d.getDriverLicenseYear()>=3)
			return true;
		else
			return false;
	}

	public double getTowingCapacity() {
		return towingCapacity;
	}

	public void setTowingCapacity(double towingCapacity) {
		this.towingCapacity = towingCapacity;
	}

	@Override
	public double getDailyPrice() {
		
		return 2500;
	}

}
