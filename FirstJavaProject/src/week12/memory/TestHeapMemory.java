package week12.memory;

public class TestHeapMemory {

	public static void main(String[] args) {
		Book book1=new Book(123, "Programming");
		System.out.println("A - "+book1);
		Book book2=book1;
		System.out.println("B - "+book1);
		System.out.println("C - "+book2);

		int a=6;
		printBookInfo(book1,a);
		System.out.println("D - "+book1);

	}
	
	public static void printBookInfo(Book b, int count) {
		Book book3=new Book(425, "Math");
		System.out.println("E - "+book3);

		count+=10;
		b.setName("Database Management");
		System.out.println("F - "+b);
		System.out.println("G - "+count);	
		b=book3;
		System.out.println("H - "+b);
		System.out.println("I - "+book3);


	}

}
