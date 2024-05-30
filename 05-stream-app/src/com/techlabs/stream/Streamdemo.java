package com.techlabs.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Streamdemo {

	public static void main(String[] args) {
		try {
			FileInputStream file=new FileInputStream("D:\\assignments\\05-stream-app\\src\\com\\techlabs\\stream\\Aj.txt");
		    int ch;
		    int sum=0;
		    while((ch=file.read())!=-1) {
		    	if((char)ch!=' ') {
		    		sum++;
		    	}
		    	System.out.print((char)ch);
		    }
		    System.out.println("\n"+"no of char:"+sum);
		    		    
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
