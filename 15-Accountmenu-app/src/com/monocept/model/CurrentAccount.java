package com.monocept.model;

public class CurrentAccount extends Account{
	public static double OVER_DRAFT_LIMIT=40000;

	public CurrentAccount(long accountno, String name, double balance,double oVER_DRAFT_LIMIT) {
		super( accountno,  name,  balance);
		OVER_DRAFT_LIMIT = oVER_DRAFT_LIMIT;
	}
	public CurrentAccount() {
	}	
}