package week4.oop.examples;

public class Circle {
	private double radius;
	private double PI=3.14;
	private double area;
	private double circumference;
	
	public Circle(double radius) {
		this.radius=radius;
		calculateArea();
		calculateCircumference();
	}
	public Circle(double radius,double pi) {
		this.PI=pi;
		//this.radius=radius;
		setRadius(radius);	
		calculateArea();
		calculateCircumference();
	}
	
	public void setRadius(double r) {
		radius=r;
	}
	public double getRadius() {
		return radius;
	}
	public void calculateArea() {
		area=PI*Math.pow( radius, 2);
		
	}
	public void calculateCircumference() {
		circumference=2*PI*radius;
		
	}
	
	public double getArea() {
		return area;
	}
	
	public double getCircumference() {
		return circumference;
	}
	
	public void printInfo() {
		System.out.println("The area and perimeter of the circle of radius "+ radius+" is "+area+ " and "+ circumference);
	}

}
