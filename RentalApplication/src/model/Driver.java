package model;

public class Driver{
	private String name;
	private int age;
	private String driverLicenseNumber;
	private int driverLicenseYear;

	public Driver(String name, int age, String driverLicenseNumber, int driverLicenseYear) {
		super();
		this.name = name;
		this.age = age;
		this.driverLicenseNumber = driverLicenseNumber;
		this.driverLicenseYear = driverLicenseYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDriverLicenseNumber() {
		return driverLicenseNumber;
	}

	public void setDriverLicenseNumber(String driverLicenseNumber) {
		this.driverLicenseNumber = driverLicenseNumber;
	}

	public int getDriverLicenseYear() {
		return driverLicenseYear;
	}

	public void setDriverLicenseYear(int driverLicenseYear) {
		this.driverLicenseYear = driverLicenseYear;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName()+": [name=" + name + ", age=" + age + ", driverLicenseYear=" + driverLicenseYear + "]";
	}

	

}
