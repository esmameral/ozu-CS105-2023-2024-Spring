package week10.oop.inheritance;

public class Person implements Policyable{

	@Override
	public void createPolicy() {
		System.out.println("Policy is created for Person");

	}

}
