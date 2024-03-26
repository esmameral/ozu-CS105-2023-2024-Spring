package week7.oop.inheritance;

public class Car extends Vehicle{

	
//	@Override
//	public String getColor() {
//		return "White";
//	}
	
	@Override
    public String getColor() {
		return this.getColor();
	}
    
	@Override
	public String toString() {
		return this.getColor()+" "+getClass().getSimpleName();
	}
	
	
	
//	@Override
//	public String toString() {
//		return super.getColor();
//	}
}
