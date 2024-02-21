package week2.examples;

import java.util.Scanner;

public class Week2Lab {

	public static void main(String[] args) {
		//question1();
		//question2();
		//question3();
		question4();

	}

	// Solution Owner: Sarp Karakaya
	private static void question3() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first number:");
		double number1 = input.nextDouble();
		System.out.println("Please enter the second number:");
		double number2 = input.nextDouble();
		System.out.println("Menu:  ");
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		System.out.println("Which action do you want? ");
		int action = input.nextInt();
		switch (action) {
		case 1:
			double addition = number1 + number2;
			System.out.println("Addition=" + addition);
			System.out.println(number1 + "+" + number2 + "=" + addition);
			break;
		case 2:
			double subtraction = number1 - number2;
			System.out.println("Subtraction=" + subtraction);
			System.out.println(number1 + "-" + number2 + "=" + subtraction);
			break;
		case 3:
			double multiplication = number1 * number2;
			System.out.println("Multiplication=" + multiplication);
			System.out.println(number1 + "x" + number2 + "=" + multiplication);
			break;
		case 4:
			double division = number1 / number2;
			System.out.println("Division=" + division);
			System.out.println(number1 + "/" + number2 + "=" + division);
			break;
		default:
			System.out.println("Invalid Selection!");
		}

	}

	// Solution Owner: Arda Eryiğit
	public static void question1() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the principal amount: ");
		double principalAmount = input.nextDouble();
		System.out.println("Please enter the interest rate: ");
		double interestRate = input.nextDouble();
		System.out.println("Please enter the duration: ");
		double duration = input.nextDouble();
		double interestAmount = principalAmount * duration * interestRate / 1200;
		// delete unnecessary digits
		interestAmount = (int) (interestAmount * 100) / 100.0;

		System.out.println("You will earn an interest of " + interestAmount + " TL in " + duration + " months with "
				+ interestRate + " interest" + " % rate over " + principalAmount);

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
	//Solution Owner: Batuhan Ozcan
	public static void question4() {
		Scanner input=new Scanner(System.in);
		double sum=0;
		int count=0;
		while (sum<100) {
			System.out.println("Please enter a number: ");
			double number= input.nextDouble();
			sum += number;
			count= count+1;
		}
		double average= sum/count;
		System.out.println("Number count: "+ count+ " "+ "Average: "+ average);
	}

}
