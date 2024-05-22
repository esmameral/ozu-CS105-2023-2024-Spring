package com.ozu.model;

import java.util.Date;

public class OwnerUpdater implements BankAccountUpdater {
    private String newOwner;
    private String oldOwner;
    private Date date;
    
	public OwnerUpdater(String newOwner) {
		super();
		this.newOwner = newOwner;
		this.date=new Date();
	}

	@Override
	public void updateAccount(BankAccount acc)  {
		this.setOldOwner(acc.getOwner());
		acc.setOwner(newOwner);

	}

	@Override
	public Date getDate() {
		// TODO Auto-generated method stub
		return date;
	}

	public String getNewOwner() {
		return newOwner;
	}

	public void setNewOwner(String newOwner) {
		this.newOwner = newOwner;
	}

	public String getOldOwner() {
		return oldOwner;
	}

	public void setOldOwner(String oldOwner) {
		this.oldOwner = oldOwner;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public boolean isTransaction() {
		// TODO Auto-generated method stub
		return false;
	}

}
