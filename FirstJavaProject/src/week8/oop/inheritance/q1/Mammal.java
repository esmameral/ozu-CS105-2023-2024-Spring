package week8.oop.inheritance.q1;

public class Mammal extends Animal {
	public Mammal(String name) {
		super(name);
	}
	
	public String toString() {
		return "Mammal["+super.toString()+"]+max age:"+super.maxAge();
	}
	
	public int maxAge() {
		return 10;
	}
}
