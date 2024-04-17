package week10.oop.inheritance.exercise3;

public class Trio implements MenuItem {
	Sandwich sandwich;
	Salad salad;
	Drink drink;

	public Trio(Sandwich sandwich, Salad salad, Drink drink) {
		this.drink = drink;
		this.salad = salad;
		this.sandwich = sandwich;

	}

	@Override
	public String getName() {
		return sandwich.getName() + " / " + salad.getName() + " / " + drink.getName() + " Trio";
	}

	@Override
	public double getPrice() {
		if (sandwich.getPrice() < salad.getPrice() && sandwich.getPrice() < drink.getPrice())
			return salad.getPrice() + drink.getPrice();
		else if (salad.getPrice() < sandwich.getPrice() && salad.getPrice() < drink.getPrice())
			return sandwich.getPrice() + drink.getPrice();
		else {
			return sandwich.getPrice() + salad.getPrice();
		}
	}

}
