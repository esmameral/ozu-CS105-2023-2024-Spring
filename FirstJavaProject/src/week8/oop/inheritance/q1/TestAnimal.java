package week8.oop.inheritance.q1;

public class TestAnimal {

	public static void main(String[] args) {
		//example1();
		
		Animal m1=new Cat("Duman");
		System.out.println(m1.maxAge());
		System.out.println(m1);

	}

	public static void example1() {
		Animal anAnimal = new Animal("Snake");
		System.out.println(anAnimal);
		
		Mammal m1=new Mammal("Panda");
		Animal m2=new Mammal("Lion");
		System.out.println(m1);
		System.out.println(m2);
		
		Cat aCat= new Cat("Simba");
		Dog aDog=new Dog("Merlin");
		
		System.out.println(aCat);
		System.out.println(aDog);

		aCat.greets();
		aDog.greets();
		aDog.greets(new Dog("Haydut"));
		aDog.greets(5);
		aCat.climb(6);
		
		Animal anotherCat= new Cat("Karamel");
		Animal anotherDog=new Dog("Merlin");
		
		((Cat)anotherCat).climb(3);
		//((Cat)anotherDog).climb(3);//throws ClassCastException
		//variable's object type is Dog. We cannot cast it Cat!
	}
	
	
}
