package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.Camper;
import model.Car;
import model.Driver;
import model.Promotion;
import model.RentalCompany;
import model.Reservation;
import model.SUV;

public class Test {
	public static void main(String[] args) throws ParseException  {
		RentalCompany company = new RentalCompany("Ozu Renting");

		Promotion promotion1 = new Promotion("ABCW", 15);
		Promotion promotion2 = new Promotion("XDKS", 20);
		
		Car vehicle1 = new Car("Honda", "Civic", 2023, "34 KLM 32", "Automatic", 5);
		Car vehicle2 = new Car("Renault", "Megane", 2023, "34 U 3812", "Automatic", 5);
		SUV vehicle3 = new SUV("Nissan", "Qashqai", 2021, "34 ABC 67", "Automatic", 5,2000);
		Camper vehicle4 = new Camper("Adria", "Coral XL", 2023, "34 DEF 42", "Automatic", 7, Camper.CAMPER_TYPE_MOTORHOME);

		company.addVehicle(vehicle1);
		company.addVehicle(vehicle2);
		company.addVehicle(vehicle3);

	
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date pickupDate = dateFormat.parse("27-03/2024");
		Date returnDate = dateFormat.parse("30/03/2024");
		Driver driver1 = new Driver("Ali", 18, "11111111", 2020);
		Driver driver2 = new Driver("Hasan Demir", 24, "222222", 2020);
		Driver driver3 = new Driver("Ece Kara", 24, "345522", 2020);
		//Reservation r1=company.makeReservation(vehicle1, driver1, pickupDate, returnDate, "SAW", "SAW", null);
		company.makeReservation(vehicle1, driver2, pickupDate, returnDate, "SAW", "SAW", promotion1);
		company.makeReservation(vehicle2, driver2, pickupDate, returnDate, "SAW", "KADIKOY", promotion1);
//		company.makeReservation(vehicle3, driver3, pickupDate, returnDate, "KURTKOY", "KURTKOY", null);
//		
//		company.returnVehicle(r1.getReservationNumber());
//		company.printRentedVehicles();
//		company.printCompletedReservations();
//		company.printActiveReservations();

	}
}
