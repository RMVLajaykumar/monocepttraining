package com.monocept.oopsmodel;

public class Account {
	private long accountno;
	private String accounttype;
	private String name;
	private double balance;
	
	
	public void setAccountno(long accountno1) {
	accountno=accountno1;
	}
	public long getAccountno() {
		return accountno;
	}
	public void setAccounttype(String accounttype1) {
		accounttype=accounttype1;
		}
	public String getAccounttype() {
		return accounttype;
	}
	
	public void setName(String name1) {
		name=name1;
	}
	public String getName(){
		return name;
	}
	public void setBalance(double balance1) {
		balance=balance1;
	}
	public double getBalance() {
		return balance;
	}
}
