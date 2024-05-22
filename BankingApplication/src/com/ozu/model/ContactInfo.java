package com.ozu.model;

public class ContactInfo {
	public String phoneNumber;
	public String email;

	public ContactInfo() {
	}

	public ContactInfo(String phoneNumber, String email) {
		super();
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "ContactInfo [phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
	
	
}