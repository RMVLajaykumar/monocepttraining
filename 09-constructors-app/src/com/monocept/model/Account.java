package com.monocept.model;

public class Account {
	private long accountno;
	private String accounttype;
	private String name;
	private double balance;
	
	public Account() {
	}
	public Account(long accountno,String accounttype,String name,double balance) {
		this.accountno=accountno;
		this.accounttype=accounttype;
		this.name=name;
		this.balance=balance;
	}
	
	
	public void setAccountno(long accountno) {
	this.accountno=accountno;
	}
	public long getAccountno() {
		return accountno;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype=accounttype;
		}
	public String getAccounttype() {
		return accounttype;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}

}
