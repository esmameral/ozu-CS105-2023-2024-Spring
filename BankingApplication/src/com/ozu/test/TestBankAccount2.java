package com.ozu.test;

import java.io.File;
import java.util.Scanner;

import com.ozu.model.BankAccount;

public class TestBankAccount2 {

	public static void main(String[] args)  {
		
		
       
        
		BankAccount account = new BankAccount("Jim", 123);

		System.out.println(account);
		account.increaseBalance(1000);
		System.out.println(account);
		try {
			account.descreaseBalance(100);
			System.out.println(account);
			account.descreaseBalance(2000);
			System.out.println(account);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("You will get "+account.getBalance());
			try {
				account.descreaseBalance(account.getBalance());
				System.out.println(account);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		

	}

}
