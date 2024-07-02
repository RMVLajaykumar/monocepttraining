package com.monocept.structural.facade.test;

import java.util.Scanner;

import com.monocept.structural.facade.model.HotelReception;

public class HotelTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean exit=false;
		System.out.println("Good morning sir/madam welcome to our Hotel");
		while(!exit) {
			System.out.println("enter \n1.Indian menu\n2.Italian menu\n3.exit");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1:
				HotelReception hr=new HotelReception();
				hr.getIndianMenu();
				break;
			case 2:
 
				HotelReception hr1=new HotelReception();
				hr1.getItalianMenu();
				break;
				
			case 3:
				exit=true;
				System.out.println("thankyou!!");
				break;
			
		}
		

	}

}}
