package week7.oop.exercises.q3;

public class Cat extends Animal {
private String color;

public Cat(boolean vegetarian, String eats, int noOfLegs) {
	super(vegetarian,eats,noOfLegs);
}
public Cat(boolean vegetarian, String eats, int noOfLegs, String color) {
	this(vegetarian,eats,noOfLegs);
	this.color=color;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}
}
