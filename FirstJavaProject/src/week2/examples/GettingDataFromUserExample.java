package week2.examples;

import java.util.Scanner;

public class GettingDataFromUserExample {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter first number:");
		double number1=input.nextDouble();
		System.out.println("Please enter second number:");
		double number2=input.nextDouble();
		double sum=number1+number2;
		System.out.println("Sum of the numbers:"+sum);
		
		
	}

}
