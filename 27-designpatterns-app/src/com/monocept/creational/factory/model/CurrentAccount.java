package com.monocept.creational.factory.model;

public class CurrentAccount implements IAccount {
	
	private int accountno;
	private double overdraftlimit;
	
	
	
	public CurrentAccount() {
		super();
	}



	public int getAccountno() {
		return accountno;
	}



	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}



	public double getOverdraftlimit() {
		return overdraftlimit;
	}



	public void setOverdraftlimit(double overdraftlimit) {
		this.overdraftlimit = overdraftlimit;
	}



	public CurrentAccount(int accountno, double overdraftlimit) {
		super();
		this.accountno = accountno;
		this.overdraftlimit = overdraftlimit;
	}



	@Override
	public void credit(double amount) {
		
		System.out.println(amount +" credited successfully");
		
	}



	@Override
	public void debit(double amount) {
		if(amount>overdraftlimit) {
			System.out.println("you cannot debit it exceeding your limit");
		}
		if(amount<=overdraftlimit)
		System.out.println(amount+ " debited successfully");
		
	}
	
	

}
