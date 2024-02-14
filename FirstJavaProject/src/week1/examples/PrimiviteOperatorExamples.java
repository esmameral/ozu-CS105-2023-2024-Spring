package week1.examples;

public class PrimiviteOperatorExamples {

	public static void main(String[] args) {
		int a=10;
		int b=7;
		int c=9;
		int x=10;
		int y=1;
		
		System.out.println(a==b);
		System.out.println(a==c);
		
		System.out.println(10%3);
		System.out.println(10/3.0);
		
		a=a+1;//a=11
		a++;//a=12
		System.out.println(a);
		
		b--;//b=b-1
		System.out.println(b);
		
		//c=c+3;
		c+=3;
		System.out.println(c);
		c*=10;//c=c*10
		System.out.println(c);
		
		y=x++;//do assigmnet first then increase value by 1
		System.out.println(x);
		System.out.println(y);
		
		x=10;
		y=1;
		y=++x;//do increament first and then do assigment
		System.out.println(x);
		System.out.println(y);
		
		int number=123; //  % /
		
		System.out.println(number%10);//3
		System.out.println(number/10);//12
	

	}

}
