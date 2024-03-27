package week7.oop.inheritance;

public class Honda extends Car {
	
//	public Honda() {
//		super();
//		System.out.println("I am in Honda cons");
//	}
	
	public Honda() {
		super(7);
	}

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
