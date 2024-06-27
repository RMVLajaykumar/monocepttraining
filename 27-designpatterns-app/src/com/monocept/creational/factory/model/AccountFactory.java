package com.monocept.creational.factory.model;

public class AccountFactory {
	
	private static IAccount account;
	
	
	public static IAccount getAccount(String accounttype) {
		if(accounttype=="savings")
			account=new SavingsAccount();
		if(accounttype=="current")
			account=new CurrentAccount();
	  return account;
	}


}
