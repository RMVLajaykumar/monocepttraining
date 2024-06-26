package com.monocept.model;

import com.monocept.exceptions.InsufficientFundsException;
import com.monocept.exceptions.NegativeAmountException;

public class BankAccount {
	private double amount;
	private double balance;

	

	public BankAccount(double amount) {
		super();
		this.amount = amount;
		this.balance = balance;
	}

	public double getBalance() {
       return balance;
	}

	public void setBalance(double balance) {
	this.balance = balance;
  }

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void deposit() throws NegativeAmountException {
		if(amount<0)
			throw new NegativeAmountException();
		System.out.println(amount+" is deposited \n");
		
	}
	public void withdraw() throws InsufficientFundsException {
		if(amount>balance)
			throw new InsufficientFundsException();
		System.out.println(amount+" is withdrawn");
	}

	public BankAccount() {
		super();
	}
	

}
