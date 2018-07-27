package com.jda.utility;

public class InventoryFactory {

	
	private String name;
	private double weight;
	private double price;

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
		String x="\n{\n"+"Name :"+name+" \n" +"Weight :"+weight+" \n"+"Price Per Kg"+price+"\n"+"}\n";
		return x;
	}
}
