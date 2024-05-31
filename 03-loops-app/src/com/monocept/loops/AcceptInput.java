package com.monocept.loops;

import java.util.Scanner;

public class AcceptInput {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter amount:");
		int amount=scanner.nextInt();
		int twothousand=0;
		int fivehundred=0;
		int twohundred=0;
		int hundred=0;
		if(amount<=50000 && amount%100==0) {
			while(amount>=100) {
				if(amount>2000) {
					twothousand=amount/2000;
					amount=amount-(twothousand*2000);
				}
				else if(amount>500) {
					fivehundred=amount/500;
					amount=amount-(fivehundred*500);
				}
				else if(amount>200) {
					twohundred=amount/200;
					amount=amount-(twohundred*200);
			    }
				else if(amount>100) {
					hundred=amount/100;
					amount=amount-(hundred*100);
			    }
		  }
			if(twothousand!=0) {
				System.out.println("Two Thousand:"+twothousand);	
			}
			if(fivehundred!=0) {
				System.out.println("Five Hundred "+fivehundred);	
			}
			if(twohundred!=0) {
				System.out.println("Two Hundred "+twohundred);	
			}
			if(hundred!=0) {
				System.out.println("Hundred "+hundred);	
			}
			
		}
		else if(amount<=50000 && 50000%100!=0) {
			System.out.println("Amount should be in multiples of 100");
		}
		else {
			System.out.println("out of limit");
		}
			

	}

}
