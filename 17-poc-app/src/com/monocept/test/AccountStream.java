package com.monocept.test;


public class AccountStream {
	public int accounttno;
	public String name;
	public double balance;
	public AccountStream(int accounttno, String name, double balance) {
		super();
		this.accounttno = accounttno;
		this.name = name;
		this.balance = balance;
	}
	public AccountStream() {
		super();
	}
	public int getAccounttno() {
		return accounttno;
	}
	public void setAccounttno(int accounttno) {
		this.accounttno = accounttno;
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
	@Override
	public String toString() {
		return "AccountStream [accounttno=" + accounttno + ", name=" + name + ", balance=" + balance + "]";
	}

	
		

	}


