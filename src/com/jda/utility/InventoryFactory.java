package com.jda.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class InventoryFactory {

	
	private String name;
	private int weight;
	private int price;

	public InventoryFactory() throws Exception, IOException, ParseException{
		
		Object ob = new JSONParser().parse(new FileReader("C:\\Users\\1022775\\Documents\\Inventory.json"));
		JSONObject jo = (JSONObject) ob;
		JSONArray ja = (JSONArray) jo.get("Rice");
		
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
}
