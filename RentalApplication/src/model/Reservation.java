package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	public final static String STATUS_ACTIVE="active";
	public final static String STATUS_COMPLETED="completed";
	public final static double DIFFERENT_RETURN_LOCATION_FEE=2000;
	public final static double LATE_RETURN_DAILY_PENALTY_AMOUNT=1500;
		
	private String reservationNumber;
	private String pickupLocation;
	private String status;
	private String returnLocation;
	private Date pickupDate;
	private long dayCount;
	private Date returnDate;
	private Date actualReturnDate;
	private double totalAmount;
	private double extraPayment;
	private Driver driver;
	private Vehicle vehicle;

	public Reservation(Vehicle vehicle,Driver driver, String pickupLocation, String returnLocation, 
			Date pickupDate, Date returnDate) {
		this.reservationNumber=generateReservationNumber();
		this.driver = driver;
		this.vehicle=vehicle;
		this.pickupLocation = pickupLocation;
		this.returnLocation = returnLocation;
		this.pickupDate = pickupDate;
		this.dayCount = getDaysBetween(pickupDate,returnDate);
		this.status=STATUS_ACTIVE;
		this.returnDate=returnDate;
		this.totalAmount=dayCount*vehicle.getDailyPrice();
		if(!pickupLocation.equals(returnLocation)) {
			this.totalAmount+=DIFFERENT_RETURN_LOCATION_FEE;
			System.out.println("Different return location fee applied("+DIFFERENT_RETURN_LOCATION_FEE+")");
		}
		this.vehicle.setStatus(Vehicle.STATUS_RENTED);
	
	}

	public Reservation(Vehicle vehicle,Driver driver,  String pickupLocation, 
			String returnLocation, Date pickupDate, 
			Date returnDate, Promotion p) {
		this(vehicle,driver,pickupLocation, returnLocation, pickupDate, returnDate);
		if(p!=null&&!p.isUsed()) {
			
			this.totalAmount-=totalAmount*p.getDiscountRate()/100.0;
			p.setUsed(true);
			System.out.println("Promotion applied successfully");
		}else {
			System.out.println("Promotion has already been used. Standart prices applied");
		}
	}
	

    public void returnReservation() {
    	this.actualReturnDate=new Date();
    	long actualDayCount=getDaysBetween(pickupDate,actualReturnDate);
    	if(actualDayCount>dayCount) {
    		long dayDiff=actualDayCount-dayCount;
    		extraPayment=dayDiff*LATE_RETURN_DAILY_PENALTY_AMOUNT;
    		System.out.println("ADDITIONAL PAYMENT REQUIRED:"+extraPayment);
    	}
    	else {
    		System.out.println("NO ADDITIONAL PAYMENT REQUIRED");
    	}
    	System.out.println("RETURN PROCESS COMPLETED SUCCESSFULLY");
    	status=STATUS_COMPLETED;
    	vehicle.setStatus(Vehicle.STATUS_AVAILABLE);
    }

	public  long getDaysBetween(Date firstDate, Date secondDate) {
		long diff = secondDate.getTime() - firstDate.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	private String generateReservationNumber() {
		String rezNumber="R-028326-";
		for (int i = 1; i < 6; i++) {
			rezNumber+=(int)(Math.random()*10);
		}
		
		return rezNumber;
	}

	
	
	
	
	public String getReservationNumber() {
		return reservationNumber;
	}

	public void setReservationNumber(String reservationNumber) {
		this.reservationNumber = reservationNumber;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public String getReturnLocation() {
		return returnLocation;
	}

	public void setReturnLocation(String returnLocation) {
		this.returnLocation = returnLocation;
	}

	public Date getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(Date pickupDate) {
		this.pickupDate = pickupDate;
	}

	public double getDayCount() {
		return dayCount;
	}

	public void setDayCount(int dayCount) {
		this.dayCount = dayCount;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Date getActualReturnDate() {
		return actualReturnDate;
	}

	public void setActualReturnDate(Date actualReturnDate) {
		this.actualReturnDate = actualReturnDate;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	public void setDayCount(long dayCount) {
		this.dayCount = dayCount;
	}

	@Override
	public String toString() {
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		
		return "RESERVATION SUMMARY:\nreservationNumber=" + reservationNumber + 
				",\npickupLocation=" + pickupLocation+", returnLocation=" + returnLocation
				+ "\npickupDate=" + df.format(pickupDate)+", returnDate=" + df.format(returnDate) +", dayCount=" + dayCount + 
				",\nstatus=" + status +  ", totalAmount=" + totalAmount 
				+ ",\n"+ driver.toString()+",\n"+vehicle.toString()+"\n";
	}

	public double getExtraPayment() {
		return extraPayment;
	}

	public void setExtraPayment(double extraPayment) {
		this.extraPayment = extraPayment;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	

	
}
