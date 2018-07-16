package com.jda.datastructureprograms;

import java.io.*;
import java.util.*;

import com.jda.utility.Utility;

public class UnOrderedList {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\1022775\\Documents\\JL.txt");
		Utility utility = new Utility();
		String st;
		BufferedReader br = new BufferedReader(new FileReader(file));
		LinkedList<String> object = new LinkedList<String>();
		System.out.println("Give a word you want to search");
		String search = utility.takeInputString();
		while((st = br.readLine()) != null)
			object.add(st);
		boolean condition = object.contains(search);
		if(condition)
			object.remove(search);
		else 
			object.add(search);
		System.out.println(object);
		
		
	}

}
