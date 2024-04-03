package week8.oop.inheritance.q1;

public class Dog extends Mammal{
	public Dog(String name) {
		super(name);
	}
	public void greets() {
		System.out.println("Woof");
	}
	public void greets(Dog anotherDog) {
		System.out.println("Hav Hav wooof Hello");
	}
	
	public void greets(int count) {
		for (int i = 1; i <=count; i++) {
			System.out.print("Woof ");		
		}
	}
	public String toString() {
		return "Dog["+super.toString()+"]";
	}
}
