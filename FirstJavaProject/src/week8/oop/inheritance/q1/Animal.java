package week8.oop.inheritance.q1;

public class Animal {
	private String name;
	
	
	
	public Animal(String name) {
		
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Animal[name="+getName()+"]";
	}
	
	public int maxAge() {
		return 5;
	}

}
