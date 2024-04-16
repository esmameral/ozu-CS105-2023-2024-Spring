package quizzes.quiz2;

public class TestEmployee {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Ahmet Demir", 2000);
		emp1.addWork(3);
		emp1.addWork(10);
		System.out.println(emp1);

		Employee emp2 = new Employee(1, "Canan Karaca");
		emp2.addWork(5);
		emp2.addWork(2);
		emp2.addWork(10);
		System.out.println(emp2);
	}
}
