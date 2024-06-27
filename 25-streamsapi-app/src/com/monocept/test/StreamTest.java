package com.monocept.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number=Arrays.asList(10,20,3,30,40,50);
			System.out.println("All numbers");
		number.stream().forEach((x)->System.out.println(x+5));
		System.out.println("All odd numbers");
		number.stream()
		.filter((x)->x%2!=0).
		forEach((x)->System.out.println(x));
		
		List<Integer> evennumbers=number.stream().filter((x)->x%2==0).collect(Collectors.toList());
		System.out.println("All even numbers");
		evennumbers.stream().forEach((x)->System.out.println(x));		
		System.out.println();
		
		System.out.println();
		//int addition=number.stream().reduce(0,(sum,x)->sum+x));
		System.out.println("Addition: "+number.stream().reduce(0,(sum,x)->sum+x));
		
		List<Integer>multiplyer=number.stream().map((x)->x*5).collect(Collectors.toList());
		multiplyer.stream().forEach((x)->System.out.println(x));
		
		System.out.println("Sorted : ");
		number.stream().sorted(Comparator.naturalOrder()).forEach((x)->System.out.println(x));
		
		

	}

}
