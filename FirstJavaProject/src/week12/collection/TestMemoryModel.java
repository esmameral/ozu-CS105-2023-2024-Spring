package week12.collection;

public class TestMemoryModel {

	public static void main(String[] args) {
		Product p1=new Product(123,"laptop");
		System.out.println(" main:"+p1);
		int b=8;
		String name="Elena";
		int a=mymethod(b, p1,name);
		System.out.println(name);
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println(" main:"+p1);
	}

	private static int mymethod(int b,Product p1, String name) {
		System.out.println(name);
		name=name+" Selena";
		System.out.println(name);
		System.out.println("mymethod before x="+b+" "+p1);
		p1.setCode(44);
		
		Product p=new Product(44,"laptop");
		System.out.println(p1.equals(p));
		p1=p;
		System.out.println(p1.equals(p));
		b+=5;
		System.out.println("after x="+b);
		System.out.println("before x="+b+" "+p1);
		System.out.println("mymethod before x="+b+" "+p1);
		return b;
	}

}
