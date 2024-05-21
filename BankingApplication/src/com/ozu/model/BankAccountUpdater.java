package com.ozu.model;

import java.util.Date;

public interface BankAccountUpdater {
	
	public void updateAccount(BankAccount acc) throws InsufficientBalanceException ;
    public Date getDate();

}
