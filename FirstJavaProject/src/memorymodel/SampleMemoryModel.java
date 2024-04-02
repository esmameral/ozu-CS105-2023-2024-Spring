package memorymodel;

public class SampleMemoryModel {
	private static final int FIXED_INCREMENT_IN_PERCENT = 2;

    public static void main(String[] args) {
        Person p = new Person(25, 30000, "ACCOUNTING");

        int percentage = 5;

        SampleMemoryModel smm = new SampleMemoryModel();
        smm.calcAndAdjustSalary(p, percentage);
        smm.changeDepartment(p,"IT");

        System.out.println("New salary:" + p.getSalary() + " Department:" + p.getDepartment());

    }

    public void calcAndAdjustSalary(Person person, int perIncr) {
        int totalIncrement = perIncr + FIXED_INCREMENT_IN_PERCENT;
        int newSalary = person.getSalary() + person.getSalary()*totalIncrement/100;
        person.setSalary(newSalary);
    }

    public void changeDepartment(Person person, String dept) {
        person.setDepartment(dept);
    }
}
