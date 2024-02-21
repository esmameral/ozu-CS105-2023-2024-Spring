package week2.examples;

import java.util.Scanner;

public class Week2Lab {

	public static void main(String[] args) {
		 question1();
		//question2();

	}

	// From Arda Eryiğit
	public static void question1() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the principal amount: ");
		double principalAmount = input.nextDouble();
		System.out.println("Please enter the interest rate: ");
		double interestRate = input.nextDouble();
		System.out.println("Please enter the duration: ");
		double duration = input.nextDouble();
		double interestAmount = principalAmount * duration * interestRate / 1200;
		//delete unnecessary digits
		interestAmount=(int)(interestAmount*100)/100.0;
		
		System.out.println("You will earn an interest of " + interestAmount
				+ " TL in " + duration + " months with " + interestRate + " interest"
				+ " % rate over " + principalAmount);

	}

	public static void question2() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side lengths of the triangle:");
		int side1 = input.nextInt();
		int side2 = input.nextInt();
		int side3 = input.nextInt();
		if (side1 + side2 > side3 && side2 + side3 > side1 && side2 + side3 > side1)
			System.out.println("Circumference:" + (side1 + side2 + side3));
		else
			System.out.println("Invalid Triagle");

		// Second way (longest way)
		/*
		 * if(side1+side2>side3) { if(side2+side3>side1){ if(side2+side3>side1) {
		 * System.out.println("Circumference:"+(side1+side2+side3)); } else {
		 * System.out.println("Invalid Triagle"); } } else {
		 * System.out.println("Invalid Triagle"); } }else {
		 * System.out.println("Invalid Triagle"); }
		 * 
		 */
	}

}
