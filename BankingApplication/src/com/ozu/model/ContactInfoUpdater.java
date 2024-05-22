package com.ozu.model;

import java.util.Date;

public class ContactInfoUpdater implements BankAccountUpdater {
	private Date date=new Date();
	private ContactInfo newContactInfo;
	
	
	public ContactInfoUpdater(ContactInfo ci) {
		super();
		this.newContactInfo=ci;
		
	}

	@Override
	public void updateAccount(BankAccount acc) throws InsufficientBalanceException {
		if(newContactInfo.getEmail()!=null&&newContactInfo.getEmail().length()!=0) {
			acc.getContact().setEmail(newContactInfo.getEmail());
		}
		if(newContactInfo.getPhoneNumber()!=null&&newContactInfo.getPhoneNumber().length()!=0) {
			acc.getContact().setPhoneNumber(newContactInfo.getPhoneNumber());
		}
		
		

	}

	@Override
	public Date getDate() {
		// TODO Auto-generated method stu
		return date;
	}

	@Override
	public boolean isTransaction() {
		// TODO Auto-generated method stub
		return false;
	}

}
