package week2.examples;

import java.util.Scanner;

public class ConditionExamples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number:");
		int a = input.nextInt();
		if (a % 2 == 1) {
			System.out.println("Odd number");
		} else {
			System.out.println("Even number");
		}
		
		
		int b=(a%2==0) ? 10 : 20;
		System.out.println(b);

	}

}
