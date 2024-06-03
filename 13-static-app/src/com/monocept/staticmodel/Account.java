package com.monocept.staticmodel;

public class Account {
	private long accountno;
	private String name;
	private double balance;
	private static int accounts;
	
	
	public Account() {
		accounts=1;
	}
	public void AccountIncremment() {
		accounts++;
	}
	public void Display() {
		System.out.println(accounts);
	}
	
	public Account(long accountno,String name,double balance) {
		this.accountno=accountno;
		this.name=name;
		this.balance=balance;
		
	}

	public void displayDetails() {
		System.out.println("Account number is:"+accountno);
		System.out.println("Account holder name is:"+name);
		System.out.println("Account balance:"+balance);
	}
	

}
