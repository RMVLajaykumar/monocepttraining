package com.monocept.model;

import java.io.Serializable;

public class AccountSerialize implements Serializable {
	
	private long Accountno;
	private String name;
	private double balance;
	
	public AccountSerialize() {
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

	public AccountSerialize(long accountno, String name, double balance) {
		Accountno = accountno;
		this.name = name;
		this.balance = balance;
	}
	


}
