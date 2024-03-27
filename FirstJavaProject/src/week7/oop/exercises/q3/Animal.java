package week7.oop.exercises.q3;

public class Animal {
	private boolean vegetarian;
	private String eats;
	private int noOfLegs;
	private String color;
	public Animal() {
		super();
	}
	
	public Animal(boolean vegetarian, String eats, int noOfLegs) {
		super();
		this.vegetarian = vegetarian;
		this.eats = eats;
		this.noOfLegs = noOfLegs;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	public String getEats() {
		return eats;
	}
	public void setEats(String eats) {
		this.eats = eats;
	}
	public int getNoOfLegs() {
		return noOfLegs;
	}
	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	
}
