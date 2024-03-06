package week4.oop.examples;

import java.util.Scanner;

public class TestQuadraticEquation {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter value of a:");
		double a=input.nextDouble();
		System.out.println("Enter value of b:");
		double b=input.nextDouble();
		System.out.println("Enter value of c:");
		double c=input.nextDouble();
		
		QuadraticEquation eq=new QuadraticEquation(a, b, c);
		System.out.println(eq.getDiscriminant());
		eq.print();

	}

}
