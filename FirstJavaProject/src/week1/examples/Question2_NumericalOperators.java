package week1.examples;

public class Question2_NumericalOperators {

	public static void main(String[] args) {
		int x=376;
		int a = 5;
		int b = 3;
		int c = a * (a + b);
		b++;
		c += b + c; 
		int d=c--;
		int e=++b;
		System.out.println("a=" + a + " b=" + b + " c=" + c+" d="+d+" e="+e);
		System.out.println(x/10+" "+x%10+" "+x/10%10);

	}

}
