package com.monocept.test;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashmaptest {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map =new LinkedHashMap<Integer,String>();
		map.put(3,"Abc");
		map.put(2, "xyz");
		map.put(4, "qwe");
		System.out.println(map);

	}

}
