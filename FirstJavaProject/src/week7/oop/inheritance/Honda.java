package week7.oop.inheritance;

public class Honda extends Car {
	
	

	@Override
	public String getColor() {
		
		return "Red";
	}

	@Override
	public String toString() {
		return super.getColor()+" "+getClass().getSimpleName();
	}

	@Override
	public String getPlateNumber() {
		return super.getPlateNumber()+ " I am a Honda";
	}

	


	

	
	
	
	

}
