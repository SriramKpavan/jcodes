package com.jda.objectorientedprograms;

import java.io.*;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.*;
import org.json.simple.parser.*;

public class Inventory {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Object ob = new JSONParser().parse(new FileReader("C:\\Users\\1022775\\Documents\\Inventory.json"));
		JSONObject jo = (JSONObject) ob;
		JSONArray ja =  (JSONArray) jo.get("Rice");
		Iterator itr1 = ja.iterator();
		Iterator<Map.Entry> itr2;
		System.out.println("Info about rice in inventory");
		while(itr1.hasNext()) {
			itr2 = ((Map)itr1.next()).entrySet().iterator();
			while(itr2.hasNext()) {
				Map.Entry pair = itr2.next();
				System.out.println(pair.getKey() + " : " + pair.getValue());
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Info about wheat in inventory");
		Map w = (Map)jo.get("Wheat");
		itr2 = w.entrySet().iterator();
		while(itr2.hasNext()) {
			Map.Entry pair = itr2.next();
			System.out.println(pair.getKey() + " : " + pair.getValue());
		}
		System.out.println();
		
		System.out.println("Info about pulses in inventory");
		Map p = (Map)jo.get("Pulses");
		itr2 = p.entrySet().iterator();
		while(itr2.hasNext()) {
			Map.Entry pair = itr2.next();
			System.out.println(pair.getKey() + " : " + pair.getValue());
		}
		
	}

}
