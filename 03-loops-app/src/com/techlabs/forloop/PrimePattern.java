package com.techlabs.forloop;

public class PrimePattern {

	public static void main(String[] args) {
		int number=71;
		int cur=0,prev=0;
		for(int i=2;i<=number;i++) {
			boolean flag=true;
			for(int j=2;j<i/2;j++) {
				if(i%j==0) {
					flag=false;
					break;
					
				}
			}
			if (flag) {
				    if(prev+1 == cur) {
				    	System.out.println();
				    	prev=cur;
				    	cur=0;
					
				}
				    System.out.print(i+" ");
				    cur++;
				
						
					}

	}

	}
}
