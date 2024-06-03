package com.monocept.model;

public class SavingsAccount extends Account{
	public static  double MIN_BALANCE=1000;

	public  double getMIN_BALANCE() {
		return MIN_BALANCE;
	}

	public  void setMIN_BALANCE(double mIN_BALANCE) {
		this.MIN_BALANCE = mIN_BALANCE;
	}
	public SavingsAccount() {
	}

	public SavingsAccount(long accountno, String name, double balance,double mIN_BALANCE) {
		super( accountno,name, balance);
		MIN_BALANCE = mIN_BALANCE;
	}

	@Override
	public String toString() {
		return "SavingsAccount [getAccountno()=" + getAccountno() + ", getName()=" + getName() + ", getBalance()="
				+ getBalance() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
	

}
