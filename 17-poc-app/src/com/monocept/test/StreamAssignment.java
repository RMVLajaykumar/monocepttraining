package com.monocept.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamAssignment {

	public static void main(String[] args) {
		String[]names={"Jayesh","Nimesh","Mark","Mahesh","Ramesh"};
		
		
		System.out.println("first 3 students sorted in ascending order : ");
		Arrays.stream(names)
		.sorted(Comparator.naturalOrder()).limit(3)
		.forEach((x)->System.out.println(x));
		
		System.out.println("Sorted names which contains a : ");
		Arrays.stream(names)
		.filter((x)->x.contains("a"))
		.sorted(Comparator.naturalOrder()).limit(3)
		.forEach((x)->System.out.println(x));
		
		
		System.out.println("reverse order : ");
		Arrays.stream(names)
		.sorted(Comparator.reverseOrder())
		.forEach((x)->System.out.println(x));
		
		System.out.println("First three characters of all names");
		Arrays.stream(names)
		.map(x->x.substring(0,3))
		.forEach((x)->System.out.println(x));
		
		System.out.println("names of the students that contains less than or equal to 4 characters");
		Arrays.stream(names)
		.filter((x)->x.length()<=4)
		.forEach((x)->System.out.println(x));

	}

}
