package com.monocept.forloop;


public class PrimeUptoRange {

	public static void main(String[] args) {
		int number=50;
		for(int i=2;i<=number;i++) {
			boolean flag=true;
			for(int j=2;j<i/2;j++) {
				if(i%j==0) {
					flag=false;
					break;
					
				}
			}
			if (flag==true) {
		
						System.out.println(i);
						
					}
				}
			}
}
