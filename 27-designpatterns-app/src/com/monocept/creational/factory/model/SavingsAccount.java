package com.monocept.creational.factory.model;

public class SavingsAccount implements IAccount {
	
	public SavingsAccount() {
		super();
	}
	public SavingsAccount(int accountno, String name, double balance) {
		super();
		this.accountno = accountno;
		this.name = name;
		this.balance = balance;
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
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
	private int accountno;
	private String name;
	private double balance;
	@Override
	public void credit(double amount) {
		this.balance+=amount;
		
		
	}
	@Override
	public void debit(double amount) {
		if(amount>balance) {
			System.out.println("you cant withdraw your amount");
		}
		
		this.balance-=amount;
		
		
	}
	@Override
	public String toString() {
		return "SavingsAccount [accountno=" + accountno + ", name=" + name + ", balance=" + balance + "]";
	}

}
