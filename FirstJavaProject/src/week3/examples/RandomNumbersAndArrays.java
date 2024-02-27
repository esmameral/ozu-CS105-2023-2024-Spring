package week3.examples;

/**
 * Create an array with the size of 100 and fill it with random integers between
 * [10,99]. Check array values and put elements<50 into a new array
 */
public class RandomNumbersAndArrays {

	public static void main(String[] args) {
		int[] numbers = new int[100];
		int counter = 0;
		for (int i = 0; i < 100; i++) {
			numbers[i] = (int) (Math.random() * 90) + 10;
			if (numbers[i] > 50)
				counter++;
		}
		int[] newArray = new int[counter];
		int j = 0;
		for (int i = 0; i < 100; i++) {
			if (numbers[i] > 50) {
				newArray[j] = numbers[i];
				j++;
			}
		}
		System.out.println(counter);
		System.out.println(newArray.length);

	}

}
