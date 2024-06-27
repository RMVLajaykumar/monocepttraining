package com.monocept.test;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Functiontest {

	public static void main(String[] args) {
		
		//Function
		Function<String,Integer> func=(string)->{
			return string.length();
		};
		System.out.println("the length of the words is:"+func.apply("Ajay"));
		
		//Bifunction
		BiFunction<String,String,Integer> biFunction=(string,string1)->{
			return string.length()+string1.length();
		};
           System.out.println("Length of two strings is: "+biFunction.apply("Ajay","Kumar"));
	//UnaryOperator
	UnaryOperator<String> unaryoperator=(string)->{
		return string+"How are you?";
	};
	System.out.println("the concat of two strings by uniary operartor: "+unaryoperator.apply("Hello "));
	
	      
	//BinaryOperator
	       BinaryOperator<String>binaryoperator=(string,string1)->{
	    	   return string+string1+"ok bye";
		
	};
	System.out.println("the concat of the Strings using Binaryoperator"+binaryoperator.apply("hello ", "How are you "));
	
	
	//passing static method as parameter
	 Function<String,Integer> function  = Functiontest::printMessage;
	 		System.out.println("the length of string: "+function.apply("hello"));
	 		
	 //constructor as parameter
	 		BiFunction<Integer,String,Constructtest> constructor=Constructtest::new ;
	 		Constructtest cons=constructor.apply(22, "Ajay");
	 		System.out.println("name:"+cons.getName());
	 		System.out.println("Age:"+cons.getAge());
	}
	
	
	public static int printMessage(String str) {
       return str.length();
    }

}
