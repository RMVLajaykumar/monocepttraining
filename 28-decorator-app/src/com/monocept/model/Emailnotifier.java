package com.monocept.model;

public class Emailnotifier implements INotifier {

	@Override
	public void registerNotification(Account account, double amount, String Transaction) {
		// TODO Auto-generated method stub
		System.out.println("email notify to user"+"Account number: "+account.getAccountno());
		System.out.println("account balance: "+account.getBalance());
		
		
	}





	
	
		
	

}
