package week7.oop.inheritance;

public  class Vehicle {
	private String plateNumber="34EEE56";
	
	public Vehicle() {
		super();
		System.out.println("I am in Vehicle cons");
	}
	
	public String getName() {
		return "Kara Şimşek";
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
