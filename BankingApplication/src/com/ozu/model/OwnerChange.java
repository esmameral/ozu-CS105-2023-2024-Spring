package com.ozu.model;

import java.util.Date;

public class OwnerChange implements BankAccountUpdater {
    private String newOwner;
    private Date date;
    
	public OwnerChange(String newOwner) {
		super();
		this.newOwner = newOwner;
		this.date=new Date();
	}

	@Override
	public void updateAccount(BankAccount acc)  {
		acc.setOwner(newOwner);

	}

	@Override
	public Date getDate() {
		// TODO Auto-generated method stub
		return date;
	}

}
