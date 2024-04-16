package quizzes.quiz1;

import java.util.Scanner;

/**
 * QUESTION: Read and calculate the sum of an unspecified number of integers.
 * The input <=0 signifies the end of the input. When loop ends, print sum of
 * the integers and integer count on the screen.
 * 
 * Sample Output: 
 * 
 * Enter an integer: 100 
 * Enter an integer: 50 
 * Enter an integer: 111 
 * Enter an integer: 0 
 * Sum of the numbers:261 
 * Number count:3
 * 
 */
public class Quiz1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		int i = 0;
		while (true) {
			System.out.println("Enter an integer:");
			int number = scn.nextInt();

			if (number <= 0) {
				break;
			} else {
				i++;
			}
			sum += number;
		}
		System.out.println("Sum of the numbers:" + sum);
		System.out.println("Number count:" + i);
	}

}
