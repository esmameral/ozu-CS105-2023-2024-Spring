package week7.oop.exercises.q4;

public class Week8QuestionTest {

	public static void main(String[] args) {
		Circle s1 = new Circle(5.5, "red", false);  
		System.out.println(s1);                    
		System.out.println(s1.getArea());          
		System.out.println(s1.getPerimeter());     
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		   
		Rectangle s3 = new Rectangle(1.0, 2.0, "red", false);   
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor());
		System.out.println(((Rectangle)s3).getLength());
		      
		Shape s4 = new Square(6.6);     
		System.out.println(s4);
		System.out.println(((Square)s4).getArea());
		System.out.println(s4.getColor());
		System.out.println(((Square)s4).getSide());
		  
		
		   
		

	}

}
