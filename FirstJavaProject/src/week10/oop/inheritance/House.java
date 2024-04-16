package week10.oop.inheritance;

public class House extends Building implements Policyable{

	@Override
	public void createPolicy() {
		System.out.println("Policy is created for house");
		
	}

}
