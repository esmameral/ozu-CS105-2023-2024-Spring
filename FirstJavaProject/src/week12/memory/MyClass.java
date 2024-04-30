package week12.memory;

public class MyClass {

	public static void main(String[] args) {
		int a=6,b=10;
		int d=method1(a);
	}
	private static int  method1(int a) {
		a++;
		int c=method2(a+10);
		return c*10+7;
	}
	
	private static int method2(int x) {
		x++;
		return x;
	}
	
}
