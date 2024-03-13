package week4.oop.examples;

public class TestPositionOfPoint {
	public static void main(String[] args) {
	
		Point p1 = new Point(11, 19);
		Point p2 = new Point(7, 7);
		Point p3 = new Point(5, 15);
		Point centerPoint = new Point(5, 5);

		Circle c1 = new Circle(centerPoint, 10);
	

		System.out.println(p1 + " is " + c1.positionOfPoint(p1) + c1);
		System.out.println(p2 + " is " + c1.positionOfPoint(p2) + c1);
		System.out.println(p3 + " is " + c1.positionOfPoint(p3) + c1);
		
		Point p4=new Point(5,5);	
		Circle c3 = new Circle(p3,10);
		Circle c4 = new Circle(p4,1);
		Circle c5 = new Circle(p4,1);
		System.out.println(c3.equals(c4));
		System.out.println(c4.equals(c5));

	}
}
