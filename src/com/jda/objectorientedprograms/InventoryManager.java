package com.jda.objectorientedprograms;

import java.io.*;
import java.util.*;
import java.util.LinkedList;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.jda.utility.*;

public class InventoryManager {

	public static void main(String args[]) throws Exception {
	Utility util=new Utility();
	int choice=0;
	do{
		System.out.println("Enter the choice 1. add 2. delete 3. print Value of Inventory");
		 choice=util.takeInputInteger();
		switch(choice){
		case 1:	addObj();break;
		case 2: delete();break;
		case 3: valueOfInventory();break;
		}
	}while(choice!=0);
}


public static HashMap<String, LinkedList<InventoryFactory>> read()  {
	JSONParser parser = new JSONParser();
	HashMap<String, LinkedList<InventoryFactory>> inventoryMap = new HashMap<String, LinkedList<InventoryFactory>>();
	try {
		Object obj = parser.parse(new FileReader("Input\\Inventory.json"));
		JSONObject jsonObject = (JSONObject) obj;
		String[] inventoryName = { "Rice", "Pulses", "Wheat" };
		for (String i : inventoryName) {
			JSONArray object = new JSONArray();
			object = (JSONArray) (jsonObject.get(i));
			LinkedList<InventoryFactory> list = new LinkedList<InventoryFactory>();
			for (Object inventory : object) {
				InventoryFactory inven = new InventoryFactory();
				inven.setName((String) ((JSONObject) inventory).get("name"));
				inven.setWeight(Double.parseDouble((String) ((JSONObject) inventory).get("weight")));
				inven.setPrice(Double.parseDouble((String) ((JSONObject) inventory).get("pricePerKG")));
				list.add(inven);
			}
			inventoryMap.put(i, list);
		}
	}
	catch (IOException | ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return inventoryMap;
}

public static void addObj() throws Exception {
	HashMap<String, LinkedList<InventoryFactory>> inventoryMap = read();
	Utility util = new Utility();
	InventoryFactory add = new InventoryFactory();
	System.out.println("Which product do you want to add?");
	String product = util.takeInputString();
	System.out.println("name of the " + product);
	String name = util.takeInputString();
	add.setName(name);
	System.out.println("Weight of the " + product);
	double weight = util.takeInputDouble();
	add.setWeight(weight);
	System.out.println("Price per Kg ");
	double price = util.takeInputDouble();
	add.setPrice(price);

	inventoryMap.get(product).add(add);
	toFile(inventoryMap);
}

public static void delete() throws Exception {
	HashMap<String, LinkedList<InventoryFactory>> inventoryMap = read();
	System.out.println("Enter the name ");
	Utility util = new Utility();
	String name = util.takeInputString();
	Iterator iterator = inventoryMap.keySet().iterator();
	while (iterator.hasNext()) {
		String key=iterator.next().toString();
		LinkedList<InventoryFactory> list = inventoryMap.get(key);
		for (InventoryFactory k : list) {
			if (k.getName().toString().compareTo(name) ==0){
				list.remove(k);
				toFile(inventoryMap);
				System.out.println(name);
				break;
			}
		}
	}
}

public static void toFile(HashMap<String, LinkedList<InventoryFactory>> map) {
	JSONObject obj = new JSONObject();
	int k = 0;
	Iterator iterator = map.keySet().iterator();
	while (iterator.hasNext()) {
		String key = iterator.next().toString();
		LinkedList<InventoryFactory> i = map.get(key);
		JSONArray jarray = new JSONArray();
		int j = 0;
		while (j < i.size()) {
			InventoryFactory inven = new InventoryFactory();
			inven.setName(i.get(j).getName());
			inven.setWeight(i.get(j).getWeight());
			inven.setPrice(i.get(j).getPrice());
			jarray.add(inven);
			j++;
		}
		obj.put(key, jarray);
		k++;
	}

	try (FileWriter file = new FileWriter("Inventory.json")) {

		obj.writeJSONString(file);
		file.flush();

	} catch (IOException e) {
		e.printStackTrace();
	}
}

public static void valueOfInventory() throws Exception {

	HashMap<String, LinkedList<InventoryFactory>> inventoryMap = read();
	double totalInventory=0;
	Iterator iterator = inventoryMap.keySet().iterator();
	while (iterator.hasNext()) {
		String key=iterator.next().toString();
		LinkedList<InventoryFactory> list = inventoryMap.get(key);
		for (InventoryFactory k : list) {
			double value=k.getPrice()*k.getWeight();
			System.out.println(k.getName()+"  "+value);
			totalInventory+=value;
		}
		}

	System.out.println("Total Inventory "+totalInventory);
}
}
