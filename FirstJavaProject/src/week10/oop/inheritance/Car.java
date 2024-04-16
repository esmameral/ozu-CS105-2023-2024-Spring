package week10.oop.inheritance;

public class Car extends Vehicle implements Policyable,Transferable, Comparable{

	@Override
	public void createPolicy() {
		System.out.println("Policy is created for car");

		
	}

	@Override
	public double transferPrice() {
		return 1000;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
