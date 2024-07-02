package com.monocept.creational.abstraction.modeltest;

import com.monocept.adapter.model.Biscuit;
import com.monocept.adapter.model.Chocolate;
import com.monocept.adapter.model.ShopingCart;

public class Test {
	
	public static void main(String[] args) {
		
		ShopingCart shoppingCart=new ShopingCart();
		shoppingCart.addItemToCart(new Biscuit("Marigold",10));
		
		shoppingCart.addItemToCart(new Chocolate("5star",5));
		shoppingCart.displayCart();
		System.out.println(shoppingCart.getCartPrice());

	}


}
