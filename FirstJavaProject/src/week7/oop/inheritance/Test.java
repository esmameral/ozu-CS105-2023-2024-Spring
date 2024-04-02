package week7.oop.inheritance;

public class Test {

	public static void main(String[] args) {
		Honda c = new Honda();
		
		Vehicle v = new Car();
		v.toString();
		
		System.out.println(v.getPlateNumber());
		System.out.println(v.getName());
		
		System.out.println(((Car)v).getMileage());
		
		Car v2=(Car)v;
		System.out.println(v2.getMileage());
		
		Vehicle v3=new Vehicle();
		
		
		System.out.println(((Car)v3).getMileage());
		
		
		
		
		
		
		

//		c.setPlateNumber("34 EEE 67");
//		System.out.println(c.toString());

	}

}
