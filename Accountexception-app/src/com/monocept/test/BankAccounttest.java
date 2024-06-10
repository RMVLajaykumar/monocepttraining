package com.monocept.test;

import com.monocept.exceptions.InsufficientFundsException;
import com.monocept.exceptions.NegativeAmountException;
import com.monocept.model.BankAccount;

public class BankAccounttest {

	public static void main(String[] args) {
		try {
		BankAccount account1=new BankAccount(-2);
		account1.deposit();
		}
		catch(NegativeAmountException e) {
			System.out.println(e.giveMessage());
		}
		try {
		BankAccount account2=new BankAccount(1500);
		account2.setBalance(2000);
		account2.withdraw();
		}
		catch(InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}

	}

}
