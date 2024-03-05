package week4.oop.examples;

public class Circle {
	private double radius;
	private double PI=3.14;
	private double area;
	
	
	public void setRadius(double r) {
		radius=r;
	}
	public double calculateArea() {
		area=PI*Math.pow( radius, 2);
		return area;
	}
	

}
