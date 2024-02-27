package week3.examples;

public class Examples {
	public static void main(String[] args) {
		//arrayExample1();
		//arrayExample2();
		multiDimArray();

	}
	
	public static void multiDimArray() {
		//First way 
		int[][] numbers=new int[2][5];
		
		numbers[0][3]=100;
		numbers[1][4]=200;
		
		
		//Second way
		double[][] grades= {{2.3,4,5},{6.7,7,8.8},{3.14,5.7,0}};
		//new double[3][3]
		//System.out.println(grades[2][1]);
		System.out.println("Printing array elements-Way1");
		System.out.println("define a new array for each element");
		for (int i = 0; i < grades.length; i++) {
			double[] arr=grades[i];
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j]+" ");//print each array on the same line
			}
			System.out.println();//for new array switch to another line
		}
		
		System.out.println("Printing array elements-Way2");
		System.out.println("Don't define a new array for each element");
		for (int i = 0; i < grades.length; i++) {
			for (int j = 0; j < grades[i].length; j++) {
				System.out.print(grades[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
		
	}

	public static void arrayExample2() {
		String names[] = new String[4];
		System.out.println(names.length);// 4
		System.out.println(names[2]);// null
		names[0] = "Ali";
		names[1] = "Baris";
		names[2] = "Elena";
		names[3] = "Ege";
		System.out.println(names[0]);// Ali
		System.out.println(names[3]);// Ege
		System.out.println(names[2]);// null

		for (int i = 0; i < names.length; i++) {
			System.out.println(i + ":" + names[i]);

		}
	}

	public static void arrayExample1() {
		int[] numbers = { 3, 4, 8, 9 };// index numbers:[0,1,2,3]
		System.out.println(numbers.length);// 4
		System.out.println(numbers[2]);// 8
		System.out.println(numbers[0]);// 3
		// System.out.println(numbers[6]);// java.lang.ArrayIndexOutOfBoundsException
	}
}
