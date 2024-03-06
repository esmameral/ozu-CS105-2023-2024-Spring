package week4.oop.examples;

public class QuadraticEquation {
	private double a;
	private double b;
	private double c;

	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getDiscriminant() {
		return b * b - 4 * a * c;
	}

	public double getRoot1() {
		double disc = getDiscriminant();
		if (disc >= 0)
			return (-b + Math.sqrt(disc)) / (2 * a);
		else
			return 0;
	}

	public double getRoot2() {
		double disc = getDiscriminant();
		if (disc >= 0)
			return (-b - Math.sqrt(disc)) / (2 * a);
		else
			return 0;
	}

	public void print() {
		if (getDiscriminant() < 0) {
			System.out.println("The equation has no real roots");
		} else if (getDiscriminant() == 0) {
			System.out.println("The equation has one root:" + getRoot1());

		} else {
			System.out.println("The equation has two roots:" + getRoot1() + " " + getRoot2());
		}
	}

}
