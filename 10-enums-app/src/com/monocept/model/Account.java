package com.monocept.model;

public class Account {
	
	private int accountno;
	private String name;
	private double balance;
	private AccountType accounttype;
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
	public AccountType getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(AccountType accounttype) {
		this.accounttype = accounttype;
	}
	public Account() {
		super();
	}
	public Account(int accountno, String name, double balance, AccountType accounttype) {
		super();
		this.accountno = accountno;
		this.name = name;
		this.balance = balance;
		this.accounttype = accounttype;
	}
	@Override
	public String toString() {
		return "Account [accountno=" + accountno + ", name=" + name + ", balance=" + balance + ", accounttype="
				+ accounttype + "]";
	}
	

}
