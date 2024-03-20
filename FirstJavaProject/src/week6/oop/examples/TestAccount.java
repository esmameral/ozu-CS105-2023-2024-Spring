package week6.oop.examples;

public class TestAccount {

	
	public static void main(String[] args) {
		Account acc1 = new Account("123", 100);
		Account acc2 = new Account("456", 200);
		
		System.out.println(acc1.getUsdRate());
		System.out.println(acc2.getUsdRate());
		System.out.println(acc1.toString());
		System.out.println(acc2);
		acc2.setBalance(300);
		System.out.println(Account.getUsdRate());//Correct way
		Account.setUsdRate(32);//Correct way
		System.out.println(acc1.getUsdRate());
		System.out.println(acc2.getUsdRate());
		System.out.println(acc1.toString());
		System.out.println(acc2);

	}

}
