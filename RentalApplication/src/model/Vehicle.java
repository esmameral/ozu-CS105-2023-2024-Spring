package model;

public abstract class Vehicle {
	
	public static String STATUS_AVAILABLE="Available";
	public static String STATUS_RENTED="Rented";
	
	private String licensePlateNumber;
	private String transmission;
	private String make;
	private String model;
	private int year;
	private String status;

	public Vehicle(String make, String model, int year, String licensePlateNumber, String transmission) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.licensePlateNumber = licensePlateNumber;
		this.transmission = transmission;
		this.status = Vehicle.STATUS_AVAILABLE;
	}
	
	public abstract double getDailyPrice();
	public abstract boolean checkRentalRestrictions(Driver d);
	
	public String getLicensePlateNumber() {
		return licensePlateNumber;
	}
	public void setLicensePlateNumber(String licensePlateNumber) {
		this.licensePlateNumber = licensePlateNumber;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Vehicle("+getClass().getSimpleName()+"): [licensePlateNumber=" + licensePlateNumber + ", make=" + make + ", model=" + model + ", year="
				+ year + ", status=" + status + "]";
	}


}
