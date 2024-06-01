package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentalCompany {
	private String name;

	private List<Vehicle> vehicles = new ArrayList<>();
	private List<Reservation> reservations = new ArrayList<>();

	public RentalCompany(String name) {
		super();
		this.name = name;
	}

	public void addVehicle(Vehicle vehicle) {
		 vehicles.add(vehicle);
	}

	public Reservation makeReservation(Vehicle vehicle, Driver driver, Date pickupDate, Date returnDate, 
			String pickupLocation,
			String returnLocation, Promotion promotion) {
		Reservation res;
		
		
		if (!vehicle.checkRentalRestrictions(driver)) {
			System.out.println("Your driver is not suitable for renting "+vehicle.getClass().getSimpleName());
			return null;
		}
		if (vehicle.getStatus().equals(Vehicle.STATUS_RENTED)) {
			System.out.println("Reservation request rejected. This "+vehicle.getClass().getSimpleName()+" has already been rented !!!");
			return null;
		}
		System.out.println("Reservation prerequisites have been successfully passed");
		if (promotion == null) {
			res = new Reservation(vehicle, driver, pickupLocation, returnLocation, pickupDate, returnDate);
		} else {
			res = new Reservation(vehicle, driver, pickupLocation, returnLocation, pickupDate, returnDate, promotion);
		}
		System.out.println("Reservation created successfully");
		reservations.add(res);
		System.out.println(res);
		return res;

	}

	public void printActiveReservations() {
		System.out.println("ACTIVE RESERVATIONS");
		for (Reservation reservation : reservations) {
			if(reservation.getStatus().equals(Reservation.STATUS_ACTIVE)) {
				SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
				System.out.println(reservation.getReservationNumber()+" "+reservation.getVehicle().getMake()+"/"+reservation.getVehicle().getModel()+ " return date:"+df.format(reservation.getReturnDate()));
			}
		}

	}
	
	public void printCompletedReservations() {
		System.out.println("COMPLETED RESERVATIONS");
		for (Reservation reservation : reservations) {
			if(reservation.getStatus().equals(Reservation.STATUS_COMPLETED)) {
				System.out.println(reservation.getReservationNumber());
			}
		}

	}

	public void printRentedVehicles() {
		System.out.println("RENTED VEHICLES");
		for (Vehicle v : vehicles) {
			
			if(v.getStatus().equals(Vehicle.STATUS_RENTED)) {
				System.out.println(v);
			}
			
		}
	}

	public boolean returnVehicle(String reservationNumber) {
		for (Reservation reservation : reservations) {
			if(reservation.getReservationNumber().equals(reservationNumber)) {
				reservation.returnReservation();
				return true;
			}
		}
		System.out.println("RESERVATION NOT FOUND");
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
