package week8.oop.inheritance.q1;

public class Cat extends Mammal {

	public Cat(String name) {
		super(name);
	}
	public void greets() {
		System.out.println("Meow");
	}
	public String toString() {
		return "Cat["+super.toString()+"]" ;
	}
	
	public int maxAge() {
		return 20;
	}
	
	public void climb(int count) {
		for (int i = 1; i <=count; i++) {
			System.out.println("Climb-"+i);		
		}
		System.out.println("I am a cat I can climb trees");
		
	}

}
