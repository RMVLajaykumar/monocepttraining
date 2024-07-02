package com.monocept.adapter.model;

import java.util.ArrayList;
import java.util.List;

public class ShopingCart {
	
	private ArrayList<Iitems> list;

	public ShopingCart(ArrayList<Iitems> list) {
		super();
		this.list = list;
	}
	public ShopingCart() {
		this.list = new ArrayList<>();
	}

	public List<Iitems> getList() {
		return list;
	}

	public void setList(ArrayList<Iitems> list) {
		this.list = list;
	}
	
	public void addItemToCart(Iitems item) {
		list.add(item);
	}
	public List<Iitems> getCartItems() {
		return list;
	}
	public int getCartPrice() {
		int price=0;
		for(Iitems item:list) {
			price+=item.getItemPrice();
		}
		return price;
	
	}
	public void displayCart() {
		System.out.println("ItemName-----Price");
		for(Iitems item:list) {
			System.out.println(item.getItemName()+"-----"+item.getItemPrice());
		}
		int price=0;
		for(Iitems item:list) {
			price+=item.getItemPrice();
		}
		System.out.println("Total-----"+price);
	}

	
	

}