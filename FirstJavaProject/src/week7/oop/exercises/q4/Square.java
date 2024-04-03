package week7.oop.exercises.q4;

public class Square extends Rectangle {

	public void setSide(double side) {
		//super.length=side;
		//super.width=side;
		setLength(side);
		setWidth(side);
	}
	
	public double getSide() {
		//return super.width;
		return getWidth();
	}
	
	public Square() {
		super();
		
	}

	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
		
	}

	public Square(double side) {
		super(side, side);
		
	}

	@Override
	public String toString() {
		return "Square [" + super.toString() + "]";
	}
	

}
