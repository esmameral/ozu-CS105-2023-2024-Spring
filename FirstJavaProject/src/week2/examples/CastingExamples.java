package week2.examples;

public class CastingExamples {

	public static void main(String[] args) {
//	System.out.println(Integer.BYTES);
//	System.out.println(Integer.MIN_VALUE);
//	System.out.println(Integer.MAX_VALUE);
//	
//	int a=2147483647+1;
//	System.out.println(a);
//	
//	long b=2147483647L+1;
//	System.out.println(b);
//	float x=3.15F;
	
	double amount=476.6666666666667;
	double amount1=amount*100;//47666.66666666667;
	System.out.println(amount1);
	int amount2=(int)amount1;
	System.out.println(amount2);
	double amount3=amount2/100.0;
	System.out.println(amount3);
	
	System.out.println((int)(amount*100)/100.0);
	
	
	

	}

}
