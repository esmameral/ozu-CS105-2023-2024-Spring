package week4.oop.examples;

import java.util.Objects;

public class Circle {
	private double radius;
	private double PI = 3.14;
	private double area;
	private double circumference;

	private Point center;

	public Circle(double radius) {
		this.radius = radius;
		calculateArea();
		calculateCircumference();
	}

	
	
	public Circle(Point center,double radius) {
		this.radius = radius;
		this.center = center;
	}



	public Circle(double radius, double pi) {
		this.PI = pi;
		// this.radius=radius;
		setRadius(radius);
		calculateArea();
		calculateCircumference();
	}

	public String positionOfPoint(Point p) {
		double dist = Math.sqrt(
				Math.pow(p.getX() - this.getCenter().getX(), 2) + 
				Math.pow(p.getY() - this.getCenter().getY(), 2));
		
		if(dist==radius) {
			return "On the circle ";
		}else if(dist>radius)
			return "Outside the circle ";
		else {
			return "Inside the circle ";
			
		}

	}

	

	@Override
	public String toString() {
		return "C["+center.getX()+"," +center.getY()+"]"+" radius:"+radius+"]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(area, center, radius);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if(this.radius!=other.getRadius())
			return false;
		else if(!this.getCenter().equals(other.getCenter()))
			return false;
		else
			return true;
	}



	public Point getCenter() {
		return center;
	}



	public void setCenter(Point center) {
		this.center = center;
	}



	public void setRadius(double r) {
		radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public void calculateArea() {
		area = PI * Math.pow(radius, 2);

	}

	public void calculateCircumference() {
		circumference = 2 * PI * radius;

	}

	public double getArea() {
		return area;
	}

	public double getCircumference() {
		return circumference;
	}

	public void printInfo() {
		System.out.println(
				"The area and perimeter of the circle of radius " + radius + " is " + area + " and " + circumference);
	}

}
