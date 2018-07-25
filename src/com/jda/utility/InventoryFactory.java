package com.jda.utility;

public class InventoryFactory {

	
	private String name;
	private double weight;
	private double price;

	public InventoryFactory(String name, double weight, double price){
		this.name = name;
		this.weight = weight;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString(){
		return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
}
