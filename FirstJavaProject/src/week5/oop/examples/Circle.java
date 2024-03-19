package week5.oop.examples;

import java.util.Objects;

public class Circle{
	private double radius;
	private double area;
	private static int numberOfObjects=0;
	
	public Circle(double radius) {
		this.radius=radius;
		calculateArea();
		numberOfObjects++;
	}
	
//	 public boolean equals(Object obj) {
//		 if(obj==null)
//			 return false;
//		 
//		 if(obj.getClass().getName()!=this.getClass().getName())
//			 return false;
//		 
//		 Circle other=(Circle)obj;
//		 if(radius==other.getRadius())
//			 return true;
//		 else
//		      return false;
//	    }
	
	@Override
	public int hashCode() {
		return Objects.hash(radius);
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
		return Double.doubleToLongBits(radius) == Double.doubleToLongBits(other.radius);
	}



	@Override
	public String toString() {
		return "Circle radius:"+radius ;
	}



	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius=radius;
		calculateArea();
	}

	public double getArea() {
		return area;
	}

	private void setArea(double area) {
		this.area = area;
	}
	
	private void calculateArea() {
		area=Math.PI*radius*radius;
	}

	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	
	
	

}
