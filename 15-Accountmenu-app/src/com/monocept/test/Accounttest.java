package com.monocept.test;
import java.util.Scanner;
import com.monocept.model.Account;
import com.monocept.model.CurrentAccount;
import com.monocept.model.SavingsAccount;
public class Accounttest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SavingsAccount savings=new SavingsAccount();
        CurrentAccount current=new CurrentAccount();
        boolean exits=false;
        while(!exits) {
        System.out.println("Select Account type :\n 1.savings \n 2.current \n 3.exit");
        System.out.println("enter your choice:");
        int option = scanner.nextInt();
        if(option==1)
        optionSavings(scanner,savings,option);
       if(option==2)
       optioncurrent(scanner,current,option);
       if(option==3) {
    	   exits=true;
       	   System.out.println("thankyou!!");
       }
       
     }
    }
private static void optioncurrent(Scanner scanner, CurrentAccount current, int option) {
	boolean exit=false;
	System.out.println("you choose current Account.");
	 while(!exit) {
		 System.out.println("Select operation:");
		 System.out.println(" 1.Create Account \n 2.Display Account Details \n 3.Credit into Account \n 4.Debit into Account \n 5.Exit");
		 int operation=scanner.nextInt();
     	
     	switch(operation) {
    	case 1:
    		currents(scanner,current);
    		System.out.println("your current account is created");
    		break;
    	case 2:
    		displayCurrent(current);
    		break;
    	case 3:
    		System.out.println("enter amount");
	          current.Credit(scanner.nextDouble());
	        displayCurrent(current);
	        break;
    	case 4:
    		validateCurrent(scanner,current);
    		 displayCurrent(current);
    	    break;
    	case 5:
    		 exit=true;
     		break;	 
	 }
	 }
}
private static void validateCurrent(Scanner scanner, CurrentAccount current) {
	System.out.println("enter amount");
       double amount=scanner.nextDouble();
       if(amount <CurrentAccount.OVER_DRAFT_LIMIT)
      	current.Debit(amount);
   if (amount >CurrentAccount.OVER_DRAFT_LIMIT+current.getBalance())
      System.out.println("you have exceeded the limit");
	
}
private static void optionSavings(Scanner scanner, SavingsAccount savings,int option) {
	boolean exit=false;
	System.out.println("you choose Savings Account.");
    while(!exit) {
        	System.out.println("Select operation:");
        	System.out.println(" 1.Create Account \n 2.Display Account Details \n 3.Credit into Account \n 4.Debit into Account \n 5.Exit");
        	int operation=scanner.nextInt();
        	switch(operation) {
        	case 1:
        		saving(scanner,savings);
        		System.out.println("your savings account is created");
        		break;
        	case 2:
        		displaySaving(savings);
        		break;
        	case 3:
        		System.out.println("enter amount");
    	           savings.Credit(scanner.nextDouble());
    	        displaySaving(savings);
    	        break;
        	case 4:
        		validateSavings(savings,scanner);
             	displaySaving(savings);
             	break;
        	case 5:
              exit=true;
        		break;	
        	}}	
	}

	private static void validateSavings(SavingsAccount savings, Scanner scanner) {
		System.out.println("enter amount");
    	  double amount=scanner.nextDouble();
    	if (savings.getBalance()>amount)
    	    savings.Debit(amount);
    	if(savings.getBalance()<amount)
    		System.out.println("your balance is insufficient");
   	    if (savings.getBalance()<=SavingsAccount.MIN_BALANCE ) 
            System.out.println("Please maintain the minimum balance.");
	
}
	private static void displayCurrent(CurrentAccount current) {
		System.out.println("Accoun type current");
		System.out.println("Account number :"+current.getAccountno());
		System.out.println("Account holder name:"+current.getName());
		System.out.println("Account balance:"+current.getBalance());
	}
	private static void displaySaving(SavingsAccount savings) {
		System.out.println("Accoun type savings");
		System.out.println("Account number :"+savings.getAccountno());
		System.out.println("Account holder name:"+savings.getName());
		System.out.println("Account balance:"+savings.getBalance());	
	}

	private static void currents(Scanner scanner, CurrentAccount current) {
		System.out.println("enter account no:");
    	current.setAccountno(scanner.nextLong());
    	System.out.println("enter name");
    	current.setName(scanner.next());
    	System.out.println("enter balance");
    	current.setBalance(scanner.nextDouble());
	}
	private static void saving(Scanner scanner, SavingsAccount savings) {
		System.out.println("enter account no:");
    	savings.setAccountno(scanner.nextLong());
    	System.out.println("enter name");
    	savings.setName(scanner.next());
    	System.out.println("enter balance");
    	savings.setBalance(scanner.nextDouble());
	}
}