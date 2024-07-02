package com.monocept.model;

public class SmsNotifier implements INotifier{

	@Override
	public void registerNotification(Account account, double amount, String Transaction) {
		System.out.println("sms to user:"+"accountnumber: "+account.getAccountno());
		System.out.println("account balance: "+account.getBalance());
		
	}



}
