package week3.examples;

public class MathClassExamples {

	public static void main(String[] args) {

//		System.out.println(Math.PI);
//		System.out.println(Math.max(12, 12.6));
//		System.out.println(Math.pow(2, 3));
//		System.out.println(Math.round(4.56));
//		System.out.println(Math.round(4.46));
//		System.out.println(Math.abs(-12));
		int[] randomNumbers=new int[5];
		for (int i = 0; i <= 4; i = i + 1) {
			randomNumbers[i]=(int)(Math.random() * 50)+50;	
		}
		
//		for (int i = 0; i <= 4; i = i + 1) {
//			System.out.print(randomNumbers[i]+" ");	
//		}
		
		for (int value : randomNumbers) {
			System.out.println(value);
		}
		
		

	}

}
