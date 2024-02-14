package week1.examples;

public class Question3_FindDigits {
public static void main(String[] args) {
	int number=6547;
	int firstDigit=number%10;
	int secondDigit=number/10%10;
	int thirdDigit=number/100%10;
	int fourthDigit=number/1000;
	System.out.println("First Digit:"+firstDigit);
	System.out.println("Second Digit:"+secondDigit);
	System.out.println("Third Digit:"+thirdDigit);
	System.out.println("Fourth Digit:"+fourthDigit);
	System.out.println("Sum of digits:"+(firstDigit+secondDigit+thirdDigit+fourthDigit));
}
}
