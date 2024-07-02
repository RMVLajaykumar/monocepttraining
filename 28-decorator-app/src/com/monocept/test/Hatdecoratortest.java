package com.monocept.test;

import com.monocept.model.GoldenHat;
import com.monocept.model.RibonHat;
import com.monocept.model.StandardHat;

public class Hatdecoratortest {

	public static void main(String[] args) {
		StandardHat sh=new StandardHat() ;
			System.out.println(sh.getName());
			System.out.println(sh.getPrice());
			System.out.println(sh.getDescription());
			
			System.out.println("------------------");
			GoldenHat gh=new GoldenHat(sh);
			System.out.println(gh.getName());
			System.out.println(gh.getPrice());
		System.out.println(gh.getDescripion());
		System.out.println("----------------------");
		
		RibonHat rbh=new RibonHat(gh);
		System.out.println(rbh.getName());
		System.out.println(rbh.getPrice());
		System.out.println(rbh.getDescription());
		
		

	}

}
