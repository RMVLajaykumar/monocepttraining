package com.monocept.model;

public class Account {
	private long Accountno;
	private String name;
	private  double balance;
	
	public Account() {
		
	}
	 Account(long accountno, String name, double balance) {
		Accountno = accountno;
		this.name = name;
		this.balance = balance;
	}
	public long getAccountno() {
		return Accountno;
	}
	public void setAccountno(long accountno) {
		Accountno = accountno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
    public void Credit(double amount) {
    	this.balance+=amount;
    	
    }
    public void Debit(double amount) {
    	this.balance-=amount;
    }
	

}
