package week2.examples;

import java.util.Scanner;

/*
 * Write a program. 
 * Your program first gets the number count from the user. 
 * After that, it should read numbers from the user, 
 * count how many of them are divisible by 3 and how many of 
 * them are divisible by 7, and write the results on the screen.
 */
public class LoopExample {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number count:");
		int count=scanner.nextInt();
		int divBy3=0;
		int divBy7=0;
		for (int i = 1; i <=count ; i++) {
			System.out.println("Enter a number");
			int number=scanner.nextInt();
			if(number%3==0)
				divBy3++;
			if(number%7==0)
				divBy7++;
			
		}
		System.out.println("There are "+divBy3+" numbers divisible by 3");
		System.out.println("There are "+divBy7+" numbers divisible by 7");

	}

}
