package com.monocept.stream;

import java.util.Scanner;

public class Avg1 {

	public static void main(String[] args) {
			Scanner scanner =new Scanner(System.in);
			System.out.println("Enter no of elements");
			int n=scanner.nextInt();
			int array[]=new int[n];
			 int sum=0;
			for(int i=0;i<array.length;i++) {
				array[i]=scanner.nextInt();
				sum+=array[i];
			}
			int Average=sum/=n;
			System.out.print("Average of elements are:"+Average);
		    boolean flag=false;
		    for(int i=0;i<array.length-1;i++) {
		    	for(int j=i+1;j<array.length;j++) {
		    		if(array[i]+array[j]==Average) {
		    			flag=true;
		    			break;
		    		}
		    	}
		    	 if (flag){
			    	  break;
			      }
		    	}
		    System.out.println("\n"+"pair of elements:"+flag);
		    }
	         
	}


