package week3.examples;

import java.util.Scanner;

public class Week3Examples {

	public static void main(String[] args) {
		// question2();
		// question3();
		// question4();
		// question1();
		question5();
		//question6();

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

	// Solution By: Ata Tan Dagidir
	public static void question3() {
		Scanner input = new Scanner(System.in);
		System.out.println("Give me size");
		int size = input.nextInt();
		int[] myArray = new int[size];
		int newSize = 0;// divisible by 5
		for (int i = 0; i < size; i++) {
			System.out.println("Give me the " + (i + 1) + "th Number");
			myArray[i] = input.nextInt();
			if (myArray[i] % 5 == 0) {
				newSize += 1;
			}
		}
		int[] elements = new int[newSize];
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

	// Solution from: Elena Kudret
	public static void question4() {
		int[] numbers = { 1, 5, 72 };
		boolean even = false;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.println("The array contains an even integer");
				even = true;
				break;
			}
		}
		if (!even) {
			System.out.println("No even integers in the array");
		}
	}

	public static void question5() {
		double[] values=new double[20];
		values[0]=500;
		int intCount=1;//because first element is an integer number(500)
		int lessThan1=0;
		for (int i = 1; i < values.length; i++) {
			values[i]=values[i-1]/2;
			if(values[i]<1)
				lessThan1++;
			if(values[i]==(int)values[i])
				intCount++;
		}
		System.out.println(intCount+ " elements are integer");
		System.out.println(lessThan1+" numbers are less than 1");
	}

	// Solution from: Elena Kudret
	public static void question6() {
		Scanner input = new Scanner(System.in);
		String[] summary=new String[5];
		int correctCount = 0;
		int correctAnswer=0;
		String question;
		for (int i = 0; i < 5; i++) {
			int firstNumber = (int) (Math.random() * 10);
			int secondNumber = (int) (Math.random() * 10);
			
			if (firstNumber > secondNumber) {
				question="What is " + firstNumber + "-" + secondNumber ;
				correctAnswer=firstNumber-secondNumber;
			} else {
				question="What is " + secondNumber + "-" + firstNumber ;
				correctAnswer=secondNumber-firstNumber;
			}
			System.out.println(question+"=?");
			
			int userAnswer = input.nextInt();
			question+="="+userAnswer;
			if (correctAnswer == userAnswer) {
				System.out.println("You are correct!");
				question+=" correct";
				correctCount++;
			} else {
				System.out.println("Your answer is wrong.");
				question+=" wrong";
			}
			summary[i]=question;
		}
		System.out.println("Correct	count is " + correctCount);
		for (int i = 0; i < 5; i++) {
			System.out.println(summary[i]);
		}
	}

	public static void question7() {

	}

	public static void question8() {

	}

}
