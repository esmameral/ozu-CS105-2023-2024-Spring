package week5.oop.examples;

public class TestObjects {

	public static void main(String[] args) {
		createCircleObject();
		//objectEqualOperator();
		
		
	}

	public static void objectEqualOperator() {
		System.out.println("Examples about equals method and == operator");
		Circle circ1=new Circle(12);
		Circle circ2=new Circle(12);
		Circle circ3=new Circle(10);
		
		System.out.println(circ1==circ2);//false
		
		circ3=circ2;
		System.out.println(circ2==circ3);//true
		circ2.setRadius(15);
		System.out.println(circ2);
		System.out.println(circ3);
		
		System.out.println(circ1.equals(circ2));
		System.out.println(circ2.equals(circ3));
		
		Circle circ4=new Circle(15);
		Circle circ5=new Circle(1);
		System.out.println("Equals method "+circ1.equals("ali"));
		System.out.println("Equals method "+circ2.equals(circ4));
		System.out.println("Equals method "+circ2.equals(circ5));
	}

	public static Circle createCircleObject() {
		Circle circ1=new Circle(12);
		System.out.println(Circle.getNumberOfObjects());//1
		Circle circ2=new Circle(6);
		
		System.out.println(Circle.getNumberOfObjects());//2
		
		System.out.println(circ1.getRadius());
		System.out.println(circ1.getArea());
		System.out.println(circ1.getArea());
		System.out.println();
		circ1.setRadius(10);
		System.out.println(circ1.getRadius());
		System.out.println(circ1.getArea());
		return circ1;
	}

}
