package com.monocept.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreemapTest {

	public static void main(String[] args) {
		TreeMap<Integer,String> map =new TreeMap<Integer,String>();
		map.put(2,"Abc");
		map.put(1, "xyz");
		map.put(3, "qwe");
		
		Set<Map.Entry<Integer,String>> entries=map.entrySet();
		
		for(Map.Entry entry:entries) {
			System.out.println(entry.getKey()+"----"+entry.getValue());
		}
		//System.out.println(map);

	}

}
