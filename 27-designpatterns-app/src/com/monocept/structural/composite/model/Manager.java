package com.monocept.structural.composite.model;

public class Manager implements IEmployee {
	private String name;
	private String position;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Manager(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	}
	@Override
	public String toString() {
		return "Manager [name=" + name + ", position=" + position + "]";
	}
	@Override
	public void showEmployeeDetails() {
		System.out.println("employee name: "+this.getName());
		System.out.println("employee postion:"+this.getPosition());
		
	}
	public Manager() {
		super();
	}
	

}
