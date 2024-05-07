package week12.memorymodel;

public class Person {
    private int age;
    private int salary;
    String department;

    public Person(int age, int salary) {
        this.age = age;
        this.salary = salary;
    }

    public Person(int age, int salary, String department) {
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
