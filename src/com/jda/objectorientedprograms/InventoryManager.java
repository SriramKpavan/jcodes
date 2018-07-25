package com.jda.objectorientedprograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class InventoryManager {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Object ob = new JSONParser().parse(new FileReader("C:\\Users\\1022775\\Documents\\Inventory.json"));
		JSONObject jo = (JSONObject) ob;
		JSONArray ja =  (JSONArray) jo.get("Rice");
		Iterator itr1 = ja.iterator();
		Iterator<Map.Entry> itr2;
		while(itr1.hasNext()) {
			itr2 = ((Map) itr1.next()).entrySet().iterator();
			
		}
	}

	public void print() {
		
	}
}
