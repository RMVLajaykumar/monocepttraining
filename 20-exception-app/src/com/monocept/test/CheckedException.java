package com.monocept.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CheckedException {

	public static void main(String[] args) {
		try {
			
		FileReader file = new FileReader("D:\\assignments\\20-exception-app\\src\\com\\monocept\\test\\demo.txt");
		//FileReader file = new FileReader("D:\\\\assignments\\\\20-exception-app\\\\src\\\\com\\\\monocept\\\\test\\\\demo.txt")
		try {
				System.out.println(file.read());
			} catch (IOException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
			}
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
		
//		String str="gfd";
//		int a=Integer.parseInt(str);
//		System.out.println(a);
		
//		Scanner scanner =new Scanner(System.in);
//		int a =scanner.nextInt();
		
	
		
		
	}
}
