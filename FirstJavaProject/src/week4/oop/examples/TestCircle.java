package week4.oop.examples;

public class TestCircle {

	public static void main(String[] args) {
		
		System.out.println("CIRCLE 1");
		Circle circ1=new Circle(10);
		circ1.printInfo();
		
		circ1.setRadius(3);
		circ1.calculateArea();
		circ1.calculateCircumference();
		circ1.printInfo();
		
		
		System.out.println("CIRCLE 2");
		Circle circ2=new Circle(20,3.1415);
		circ2.printInfo();
		
		System.out.println("CREATE RANDOM CIRCLES");
		for (int i = 1; i <= 5; i++) {
			Circle circle=new Circle((int)(Math.random()*20));
			circle.printInfo();
			
		}
		
		
		
		
		
	
	}

}
