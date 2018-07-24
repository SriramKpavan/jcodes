package com.jda.objectorientedprograms;

import java.io.*;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.*;
import org.json.simple.parser.*;

public class StockReport {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Object ob = new JSONParser().parse(new FileReader("C:\\Users\\1022775\\Documents\\StockRep.json"));
		JSONObject jo = (JSONObject) ob;
		JSONArray array = (JSONArray) jo.get("Stock");
		int numOfShares = 0, price = 0, totalPrice = 0, finalPrice = 0;
		String name = null;
		Iterator itr1 = array.iterator();
		Iterator<Map.Entry> itr2;
		System.out.println("Stock Report");
		//System.out.println();
		while(itr1.hasNext()) {
			itr2 = ((Map)itr1.next()).entrySet().iterator();
			int i = 1;
			while(itr2.hasNext()) {
				Map.Entry pair = itr2.next();
				System.out.println(pair.getKey() + " : " + pair.getValue());
				if(pair.getKey().equals("name"))
					name = (String) pair.getValue();
				else if(pair.getKey().equals("number"))
					numOfShares = Integer.parseInt((String) pair.getValue());
				else if(pair.getKey().equals("stockPrice"))
					price = Integer.parseInt((String) pair.getValue());
				totalPrice = numOfShares * price;	
			}
			System.out.println("The value of the " + name + " stocks with you is " + totalPrice);
			System.out.println();
			finalPrice += totalPrice; 
		}
		System.out.println("The value of all the stocks with you is " + finalPrice);
		
	}
	

}
