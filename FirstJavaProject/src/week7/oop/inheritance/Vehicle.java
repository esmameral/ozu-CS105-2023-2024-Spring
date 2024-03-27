package week7.oop.inheritance;

public  class Vehicle {
	private String plateNumber;
	
	public Vehicle() {
		super();
		System.out.println("I am in Vehicle cons");
	}
	
	public String getColor() {
		return this.getPlateNumber()+ "Black";
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
//	@Override
//	public String toString() {
//		return getColor();
//	}
	
	



	
	

}
