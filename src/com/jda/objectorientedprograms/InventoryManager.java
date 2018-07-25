package com.jda.objectorientedprograms;

import java.io.*;
import java.util.*;
import java.util.LinkedList;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;

import com.jda.utility.*;

public class InventoryManager {

	static Utility utility = new Utility();
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Object ob = new JSONParser().parse(new FileReader("Input\\Inventory.json"));
		JSONObject jo = (JSONObject) ob;
		String[] item = {"Rice", "Wheat", "Pulses"};
		HashMap<String, LinkedList<Object>> inventoryMap = new HashMap<String, LinkedList<Object>>();
		readObjects(inventoryMap, item, jo);
		int choice = 0;
		do{
			choice = utility.takeInputInteger();
			switch(choice){
			case 1 :
				
			}
		}while(choice != 0);
		
	}

	public void add(HashMap<String, Object> inventoryMap){
	   System.out.println("Give the attribute to which you want to add");
	   String attr = utility.takeInputString();
	   System.out.println("Give the type of the attribute");
		String name = utility.takeInputString();
		System.out.println("Give the amount of attribute");
		double weight = utility.takeInputDouble();
		System.out.println("Give the price of the attribute");
		double price = utility.takeInputDouble();
		Object inv = new InventoryFactory(name, weight, price);
		LinkedList<Object> list = new LinkedList<Object>();
		list.add(inv);
		inventoryMap.put(attr, list);
	}
	
	public void print(HashMap<String, Object> inventoryMap) {
		
	}
	
	public static void readObjects(HashMap<String,LinkedList<Object>> inventoryMap, String[] item, JSONObject jo){
		for(String i : item){
			JSONArray ja = (JSONArray) jo.get(i);
			LinkedList<Object> list = new LinkedList<Object>();
			for(Object inventory : ja){
				Object inv = new InventoryFactory(null, 0 ,0);
				((InventoryFactory) inv).setName((String)((JSONObject) inventory).get("name"));
				((InventoryFactory) inv).setWeight((double)((JSONObject) inventory).get("weight"));
				((InventoryFactory) inv).setPrice((double)((JSONObject) inventory).get("price"));
				list.add((InventoryFactory) inv);
			}
			inventoryMap.put(i, list);
		}
	}
	
	public static void remove(HashMap<String, LinkedList<Object>> inventoryMap){
		System.out.println("Give the attribute in which you want to remove");
	   String attr = utility.takeInputString();
	   System.out.println("Give the type of the attribute");
		String name = utility.takeInputString();
		System.out.println("Give the amount of attribute");
		double weight = utility.takeInputDouble();
		System.out.println("Give the price of the attribute");
		double price = utility.takeInputDouble();
		Object inv = new InventoryFactory(name, weight, price);
		LinkedList<Object> list = new LinkedList<Object>();
		list = inventoryMap.get(attr);
		if(list.contains(inv))
			list.remove(inv);
		inventoryMap.put(attr, list);
	}
}
