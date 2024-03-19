package week4.oop.examples;

public class TestTriangle {

	public static void main(String[] args) {
		Triangle tr1=new Triangle();//no-arg constructor
		tr1.print();//print tr1 on the screeen
		System.out.println("Area:"+tr1.getArea());
		System.out.println("Perimeter:"+tr1.getPerimeter());
			
		Triangle tr2=new Triangle(3,4,5);//add another constructor
		tr2.print();
		System.out.println("Area:"+tr2.getArea());
		System.out.println("Perimeter:"+tr2.getPerimeter());
		
		
		Triangle tr3=new Triangle(3,7,5);
		tr3.print();
		System.out.println(tr3);
		System.out.println("Area:"+tr3.getArea());
		System.out.println("Perimeter:"+tr3.getPerimeter());
/*
 * Triangle: side1=1.0 side2=1.0 side3=1.0
Area:0.4330127018922193
Perimeter:3.0
Triangle: side1=3.0 side2=4.0 side3=5.0
Area:6.0
Perimeter:12.0

 */

	}

}
