package week3.examples;

import java.util.Scanner;

public class Week3Examples {

	public static void main(String[] args) {
		//question2();
		question3();

	}

	// Solution from: Emir Gencay
	public static void question2() {
		int[] numbers = { 4, 6, 1, 8, 9, 7 };
		System.out.println("3. Index " + numbers[3]);
		System.out.println("5. Index " + numbers[5]);
		System.out.println("The size of the array " + numbers.length);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}

	public static void question1() {

	}
	//Solution By: Ata Tan Dagidir
	public static void question3() {
		Scanner input = new Scanner(System.in);
		System.out.println("Give me size");
		int size = input.nextInt();
		int[] myArray= new int[size];
		int newSize = 0;//divisible by 5
		for (int i = 0; i < size; i++) {
			System.out.println("Give me the " + (i + 1) + "th Number");
			myArray[i] = input.nextInt();
			if (myArray[i] % 5 == 0) {
				newSize += 1;
			}
		}
		int[] elements=new int[newSize];
		int s = 0;
		for (int number : myArray) {
			if (number % 5 == 0) {
				elements[s] = number;
				s++;
			}
		}
		System.out.println("elements in the array which are divisible by 5:");
		for (int number : elements) {
			System.out.println(number);
		}
	}

	public static void question4() {

	}

	public static void question5() {

	}

	public static void question6() {

	}

	public static void question7() {

	}

	public static void question8() {

	}

}
