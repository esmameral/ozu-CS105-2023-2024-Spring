package model;

public class Camper extends Vehicle  {
	public static String CAMPER_TYPE_TRAVEL_TRAILER = "Travel Trailer";
	public static String CAMPER_TYPE_VAN = "Van";
	public static String CAMPER_TYPE_MOTORHOME = "Motorhome";
	private int numberOfBeds;
	private String type;

	public Camper(String make, String model, int year, String licensePlateNumber, String transmission, int numberOfBeds,
			String type) {
		
		
		super(make, model, year, licensePlateNumber, transmission);
		this.numberOfBeds = numberOfBeds;
		this.type = type;
	}

	

	@Override
	public double getDailyPrice() {

		return 10000;
	}

	public int getNumberOfBeds() {
		return numberOfBeds;
	}

	public void setNumberOfBeds(int numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	

	@Override
	public boolean checkRentalRestrictions(Driver d) {
		if (d.getAge()>=25 && d.getDriverLicenseYear()>=5)
			return true;
		else
			return false;
	}



	@Override
	public String toString() {
		
		return super.toString() + numberOfBeds;
	}

	
}
