package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private int accountno;
	private String accountname;
	private double balance;
	List<INotifier> notifier = new ArrayList();

	public Account(int accountno, String accountname, double balance) {
		super();
		this.accountno = accountno;
		this.accountname = accountname;
		this.balance = balance;
	}

	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	public String getAccountname() {
		return accountname;
	}

	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void registerUser(INotifier notifiers) {

		for (INotifier notify : notifier) {
			if (notify.getClass().equals(notifiers.getClass())) {

				return;
			}

		}
		notifier.add(notifiers);
		return;

	}

	public void withDraw(double amount) {
		if (balance > amount) {
			balance = balance - amount;
			for (INotifier x : notifier) {
				x.registerNotification(this, amount, "withdraw");
			}
		}
	}

	public void deposit(double amount) {

		this.balance += amount;
		for (INotifier notifier : notifier) {
			notifier.registerNotification(this, amount, "deposit");

		}

	}

	@Override
	public String toString() {
		return "Account [accountno=" + accountno + ", accountname=" + accountname + ", balance=" + balance + "]";
	}

}
