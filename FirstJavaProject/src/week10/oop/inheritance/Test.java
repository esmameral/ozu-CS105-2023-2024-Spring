package week10.oop.inheritance;

public class Test {

	public static void main(String[] args) {
		House house=new House();
		Person p=new Person();
		Car c=new Car();
		Book b=new Book();
		Policyable[] array=new Policyable[4];
		array[0]=house;
		array[1]=p;
		array[2]=c;
		array[3]=b;
		
		createPolicies(array);
		

	}
	
	
	public static void createPolicies(Policyable[] array) {
		for (Policyable policyable : array) {
			policyable.createPolicy();
		}
		
		
	}

}
